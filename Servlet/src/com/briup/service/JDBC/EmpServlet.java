package com.briup.service.JDBC;

import com.briup.dom.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/Emp")
public class EmpServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter pw = response.getWriter();
        List<User> list = (List<User>) request.getSession().getServletContext().getAttribute("list");
        pw.println("<table border=\"1\" style=\"border-collapse: collapse;text-align: center;\">");
        pw.println("<tr><td>用户</td><td>密码</td></tr>");
        for (User user : list) {
            pw.println("<tr><td>" + user.getName() + "</td><td>" + user.getPwd() + "</td></tr>");
        }
        pw.println("</table>");
        pw.println("</table>");
        pw.close();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
