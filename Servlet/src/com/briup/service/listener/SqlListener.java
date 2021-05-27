package com.briup.service.listener;

import com.briup.dom.User;
import com.briup.service.JDBC.ConnectionFactory;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@WebListener("*")
public class SqlListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        Connection connection = new ConnectionFactory().getConnection();
        List<User> list = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            String sql = "select * from student";
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                list.add(new User(resultSet.getString("name"), resultSet.getString("pwd")));
            }
            servletContextEvent.getServletContext().setAttribute("list", list);
            servletContextEvent.getServletContext().setAttribute("sum", 0);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
