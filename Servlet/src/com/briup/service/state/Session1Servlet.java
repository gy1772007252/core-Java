package com.briup.service.state;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Session1")
public class Session1Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter pw = response.getWriter();

        HttpSession session = request.getSession();
        session.setAttribute("orderId", "34334");
        session.setAttribute("user", "session");

        request.setAttribute("user", "request");
        session.getServletContext().setAttribute("user", "application");
        //session.invalidate();

        session.setMaxInactiveInterval(10);

        String session2 = response.encodeURL("Session2");
        response.sendRedirect(session2);

        pw.flush();
        pw.close();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
