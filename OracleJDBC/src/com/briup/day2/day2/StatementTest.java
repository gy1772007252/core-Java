package com.briup.day2.day2;

import com.briup.bean.User;
import com.briup.dom.ConnectionFactory;

import java.sql.*;

public class StatementTest {

    public static void main(String[] args) {

        User user = new User(1, "tom", "123456", 1, "男");
        try {
            //create();
            //addUser(user);
            //insertUser(user);
            //loginBySt("tom", "123456");
            //loginByPst("tom", "123456");
            //addBySt();
            //addByRst();
            //addByBaSt();
            addByBaRst();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

    /**
     * 最快
     * @throws SQLException
     */
    private static void addByBaRst() throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        String sql = "insert into h_user " +
                "values(?,?,?,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            preparedStatement.setInt(1, i);
            preparedStatement.setString(2, "tom" + i);
            preparedStatement.setString(3, "123456");
            preparedStatement.setString(4, "男");
            preparedStatement.setInt(5, 20);
            preparedStatement.addBatch();
            if ((i + 1) % 100 == 0) {
                preparedStatement.executeBatch();
            }
        }
        preparedStatement.executeBatch();
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    private static void addByBaSt() throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        Statement statement = connection.createStatement();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            String sql = "insert into h_user " +
                    "values('" +
                    i + "','" +
                    "tom" + i + "','" +
                    "123456" + "','" +
                    "男" + "','" +
                    "20" +
                    "')";
            statement.addBatch(sql);
            if ((i + 1) % 100 == 0) {
                statement.executeBatch();
            }
        }
        statement.executeBatch();
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    private static void addByRst() throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        String sql = "insert into h_user " +
                "values(?,?,?,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            preparedStatement.setInt(1, i);
            preparedStatement.setString(2, "tom" + i);
            preparedStatement.setString(3, "123456");
            preparedStatement.setString(4, "男");
            preparedStatement.setInt(5, 20);
            preparedStatement.execute();
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    private static void addBySt() throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        Statement statement = connection.createStatement();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            String sql = "insert into h_user " +
                    "values('" +
                    i + "','" +
                    "tom" + i + "','" +
                    "123456" + "','" +
                    "男" + "','" +
                    "20" +
                    "')";
            statement.execute(sql);
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    private static void loginByPst(String name, String pwd) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        String sql = "select * " +
                "from h_user " +
                "where name = ? " +
                "and pwd = ? ";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, name);
        preparedStatement.setString(2, pwd);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            System.out.println(resultSet.getString("name"));
        }
    }

    private static void loginBySt(String name, String pwd) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        Statement statement = connection.createStatement();
        String sql = "select * " +
                "from h_user " +
                "where name = '" + name +
                "' and pwd = '" + pwd + "'";
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()) {
            System.out.println(resultSet.getString("name"));
        }
    }

    private static void insertUser(User user) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        String sql = "insert into h_user " +
                "values(?,?,?,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        preparedStatement.setInt(1, user.getId());
        preparedStatement.setString(2, user.getName());
        preparedStatement.setString(3, user.getPwd());
        preparedStatement.setString(4, user.getGender());
        preparedStatement.setInt(5, user.getAge());

        int l = preparedStatement.executeUpdate();
        System.out.println(l);
    }

    private static void addUser(User user) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        Statement statement = connection.createStatement();
        String sql = "insert into h_user " +
                "values('" +
                user.getId() + "','" +
                user.getName() + "','" +
                user.getPwd() + "','" +
                user.getGender() + "','" +
                user.getAge() +
                "')";
        int i = statement.executeUpdate(sql);
        System.out.println(i);
    }

    private static void create() throws SQLException {
        ConnectionFactory connectionFactory = new ConnectionFactory();
        Connection connection = connectionFactory.getConnection();
        Statement statement = connection.createStatement();

        String sql = "create table h_user( " +
                "id number primary key, " +
                "name varchar2(10) not null, " +
                "pwd varchar2(10), " +
                "gender char(3) check(gender in('男', '女')), " +
                "age number(2) " +
                ")";
        statement.execute(sql);
    }

}
