package com.briup.service.form;

import com.briup.dom.User;
import com.briup.service.JDBC.ConnectionFactory;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        boolean flag = false;
        String name = request.getParameter("name");
        String pwd = request.getParameter("pwd");

        List<User> list = (List<User>) request.getSession().getServletContext().getAttribute("list");
        for (User user : list) {
            String nameUser = user.getName();
            String pwdUser = user.getPwd();
            if (name.equals(nameUser) && pwd.equals(pwdUser)) {
                flag = true;
            }
        }

        if (flag) {
            //重定向
            if (request.getParameter("auto") != null) {
                Cookie nameAuto = new Cookie("nameAuto", name);
                Cookie pwdAuto = new Cookie("pwdAuto", pwd);
                nameAuto.setMaxAge(60*60*24*3);
                pwdAuto.setMaxAge(60*60*24*3);
                response.addCookie(nameAuto);
                response.addCookie(pwdAuto);
            }
            if (request.getParameter("remember") != null) {
                Cookie nameRem = new Cookie("nameRem", name);
                Cookie pwdRem = new Cookie("pwdRem", pwd);
                nameRem.setMaxAge(60*60*24*365*100);
                pwdRem.setMaxAge(60*60*24*365*100);
                response.addCookie(nameRem);
                response.addCookie(pwdRem);
            }
            request.getSession().setAttribute("isLogin", true);
            ServletContext servletContext = request.getSession().getServletContext();
            servletContext.setAttribute("sum", ((int) servletContext.getAttribute("sum") + 1));
            response.sendRedirect(getServletContext().getContextPath() + "/form/index.jsp");
        } else {
            //跳转
            request.getSession().setAttribute("isLogin", false);
            request.getRequestDispatcher("form/login.jsp").forward(request, response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
