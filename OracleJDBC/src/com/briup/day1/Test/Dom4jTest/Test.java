package com.briup.day1.Test.Dom4jTest;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class Test {

    public static void main(String[] args) throws DocumentException {

        SAXReader saxReader = new SAXReader();
        Document document = saxReader.read(new File("src/com/briup/day1/Test/Dom4jTest/oracle.xml"));
        Element root = document.getRootElement();

        Element driverClass = root.element("driverClass");
        Element url = root.element("url");
        Element user = root.element("user");
        Element password = root.element("password");

        String driverClassText = driverClass.getText();
        String urlText = url.getText();
        String userText = user.getText();
        String passwordText = password.getText();

        try {
            Class.forName(driverClassText);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        Connection connection = null;
        try {
            connection = DriverManager.getConnection(urlText, userText, passwordText);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        System.out.println(connection);

        try {
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

}
