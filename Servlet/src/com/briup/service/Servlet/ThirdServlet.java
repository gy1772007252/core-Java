package com.briup.service.Servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ThirdServlet extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        servletResponse.setCharacterEncoding("UTF-8");
        servletResponse.setContentType("text/html;charset=UTF-8");

        PrintWriter pw = servletResponse.getWriter();
        pw.println("<html><body><table boder=1 style='width:200px;'>");
        pw.println("<tr><td>姓名<td><td>分数<td><td>性别<td><tr>");
        pw.println("<tr><td>张三<td><td>100<td><td>男<td><tr>");
        pw.println("<tr><td>李四<td><td>100<td><td>男<td><tr>");
        pw.println("</table></body></html>");
        pw.flush();
        pw.close();
    }
}
