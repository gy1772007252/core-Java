package com.briup.service.upload;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

@WebServlet("/upload1") 
public class UpLoadServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String path ="/upload";
	
	@Override
	public void init() throws ServletException {
		path = getServletConfig().getInitParameter("path");
	}
	
	
	@SuppressWarnings("unchecked")
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String realpath = this.getServletContext().getRealPath(path);
		
		try {
			DiskFileItemFactory factory = new DiskFileItemFactory();
			ServletFileUpload upLoad = new ServletFileUpload(factory);
			
			List<FileItem> list = upLoad.parseRequest(request);

			for (FileItem fileItem : list) {
				if (fileItem.isFormField()) {
					String FieldName = fileItem.getFieldName();
					String Content = fileItem.getString("UTF-8");
					request.setAttribute(FieldName, Content);
				} else {
					String fileName = fileItem.getName();
					fileName = System.currentTimeMillis()+fileName;
					File file = new File(realpath, fileName);
					fileItem.write(file);
				}
			}
			System.out.println("request.getAttribute(\"username\") = "+request.getAttribute("username"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
