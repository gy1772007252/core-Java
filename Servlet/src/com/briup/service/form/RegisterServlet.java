package com.briup.service.form;

import com.briup.service.JDBC.ConnectionFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userName = request.getParameter("userName");
        String userPwd = request.getParameter("userPwd");

        if (!userName.equals("")) {
            //重定向
            Connection connection = ConnectionFactory.getConnection();
            try {
                String sql = "insert into student  values(?,?)";
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setString(1, userName);
                preparedStatement.setString(2, userPwd);
                int i = preparedStatement.executeUpdate();
                if (i != 0) {
                    response.sendRedirect(getServletContext().getContextPath() + "/form/login.jsp");
                } else {
                    request.getRequestDispatcher("form/register.html").forward(request, response);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else {
            //跳转
            request.getRequestDispatcher("form/register.html").forward(request, response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
