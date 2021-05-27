package com.briup.dom;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class ConnectionFactory {

    private static String driver;
    private static String url;
    private static String username;
    private static String passwd;

    static {
        try {
            Properties properties = new Properties();
            //properties.load(new FileInputStream("src/com/briup/dom/db.properties"));
            properties.load(ConnectionFactory.class.getResourceAsStream("db.properties"));
            driver = properties.getProperty("jdbc.driver");
            url = properties.getProperty("jdbc.url");
            username = properties.getProperty("jdbc.username");
            passwd = properties.getProperty("jdbc.passwd");
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("数据库连接失败");
        }
    }

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
