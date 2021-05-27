package com.briup.service.Servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FourServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
        System.out.println("get");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("post");

        //使用字节流写图片
        OutputStream os = resp.getOutputStream();
        InputStream is = FourServlet.class.getClassLoader().getResourceAsStream("11.png");

        byte[] bytes = new byte[256];
        int len = 0;
        while ((len = is.read(bytes)) != -1) {
            os.write(bytes, 0,  len);
        }
        os.flush();
        os.close();


        /*//HTML返回图片
        PrintWriter pw = resp.getWriter();
        pw.println("<html><img src='image/11.png'></html>");
        pw.flush();
        pw.close();*/
    }
}
