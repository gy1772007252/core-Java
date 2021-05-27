package com.briup.service.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {

    private static String driver = "oracle.jdbc.driver.OracleDriver";
    private static String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
    private static String username = "briup";
    private static String passwd = "briup";


    public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName(driver);
            connection = DriverManager.getConnection(url, username, passwd);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("数据库连接失败");
        }
        return connection;
    }

}
