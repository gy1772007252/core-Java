package com.briup.day1.day1;

import com.briup.bean.User;
import com.briup.dom.ConnectionFactory;

import java.sql.*;

public class StatementTest {

    public static void main(String[] args) {

        User user = new User(1, "tom", "123456", 1, "男");
        //create();
        //addUser(user);
        insertUser(user);

    }

    private static void insertUser(User user) {
        Connection connection = ConnectionFactory.getConnection();
        try {
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

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    private static void addUser(User user) {
        Connection connection = ConnectionFactory.getConnection();
        try {
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

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    private static void create() {
        ConnectionFactory connectionFactory = new ConnectionFactory();
        Connection connection = connectionFactory.getConnection();
        try {
            Statement statement = connection.createStatement();

            String sql = "create table h_user( " +
                    "id number primary key, " +
                    "name varchar2(10) not null, " +
                    "pwd varchar2(10), " +
                    "gender char(3) check(gender in('男', '女')), " +
                    "age number(2) " +
                    ")";
            statement.execute(sql);

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

}
