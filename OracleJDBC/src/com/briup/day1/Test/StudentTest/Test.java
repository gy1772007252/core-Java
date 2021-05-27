package com.briup.day1.Test.StudentTest;

import com.briup.dom.ConnectionFactory;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Test {

    private static Connection connection = ConnectionFactory.getConnection();
    private static Statement statement;

    static {
        try {
            statement = connection.createStatement();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void main(String[] args) {

        try {

            create();
            insert();
            update();
            delete();
            select();
            List<Student> list = findAll();
            saveAll(list);

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        try {
            if (connection != null) {
                connection.close();
            }
            if (statement != null) {
                statement.close();
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

    private static void saveAll(List<Student> list) throws SQLException {

        statement = connection.createStatement();
        statement.execute("drop table t_student");

        create();
        for (Student student : list) {
            String sql = "insert into t_student " +
                    "values(" + student.getId() + ",'" + student.getName() + "'," + student.getAge() + ")";
            statement.addBatch(sql);
        }
        statement.executeBatch();

    }

    private static List<Student> findAll() throws SQLException {

        List<Student> list = new ArrayList<>();
        statement = connection.createStatement();
        String sql = "select id, name, age " +
                "from t_student";
        ResultSet resultSet = statement.executeQuery(sql);

        while (resultSet.next()) {
            list.add(new Student(resultSet.getInt("id"), resultSet.getString("name"), resultSet.getInt("age")));
        }

        return list;

    }

    private static void select() throws SQLException {
        statement = connection.createStatement();
        String sql = "select id, name, age " +
                "from t_student";
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()) {
            System.out.print(resultSet.getInt("id") + "\t\t");
            System.out.print(resultSet.getString("name") + "\t\t");
            System.out.println(resultSet.getInt("age"));
        }
    }

    private static void delete() throws SQLException {
        statement = connection.createStatement();
        String sql = "delete from t_student " +
                "where id = 5";
        statement.execute(sql);
    }

    private static void update() throws SQLException {
        statement = connection.createStatement();
        String sql = "update t_student " +
                "set name = '张三' " +
                "where id = 2";
        statement.executeUpdate(sql);
    }

    private static void insert() throws SQLException {
        statement = connection.createStatement();
        for (int i = 0; i < 10; i++) {
            String sql = "insert into t_student " +
                    "values(" + (i + 1) + ",'tom" + (i + 1) + "'," + 20 + ")";
            statement.addBatch(sql);
        }
        statement.executeBatch();
    }

    private static void create() throws SQLException {
        statement = connection.createStatement();

        String sql = "create table t_student( " +
                "id number primary key, " +
                "name varchar2(10) not null, " +
                "age number(2) " +
                ")";
        statement.execute(sql);
    }

}
