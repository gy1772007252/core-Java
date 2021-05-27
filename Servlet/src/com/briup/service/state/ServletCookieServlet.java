package com.briup.service.state;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet( "/Cookie")
public class ServletCookieServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");

        PrintWriter pw = response.getWriter();
        Cookie[] cs = request.getCookies();
        if (cs != null) {
            for (Cookie c : cs) {
                pw.println(c.getName() + "=" + c.getValue());
            }
        } else {
            pw.println("没有Cookie！");
        }
        pw.flush();
        pw.close();
        Cookie c1 = new Cookie("name", "briup");
        Cookie c2 = new Cookie("pwd", "briup");
        c1.setMaxAge(60*60);
        c2.setMaxAge(60*60);
        response.addCookie(c1);
        response.addCookie(c2);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
