package com.briup.day2.Test.teacherTest;

import com.briup.dom.JdbcUtils;

import java.sql.*;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        try {
            //insert(new Teacher(1, "tom", 20, 1000));
            //delete();
            //update();
            //insertBa();
            select();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

    private static void insertBa() throws SQLException {
        Connection connection = JdbcUtils.getConnection();
        String sql = "insert into teacher " +
                "values(?,?,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        for (int i = 1; i <= 50; i++) {
            preparedStatement.setInt(1, i);
            preparedStatement.setString(2, "tom");
            preparedStatement.setInt(3, 20);
            preparedStatement.setDouble(4, 1000);
            preparedStatement.addBatch();
        }
        preparedStatement.executeBatch();
    }

    private static void select() throws SQLException {
        String sql = "select * " +
                "from teacher";
        List<Teacher> list = JdbcUtils.queryForList(sql, Teacher.class);
        list.forEach(System.out::println);
    }

    private static void update() throws SQLException {
        String sql = "update teacher " +
                "set name = 'guyue' " +
                "where id = 1";
        JdbcUtils.executeUpdate(sql);
    }

    private static void delete() throws SQLException {
        String sql = "delete from teacher ";
        JdbcUtils.executeUpdate(sql);
    }

    private static void insert(Teacher teacher) throws SQLException {
        Connection connection = JdbcUtils.getConnection();
        String sql = "insert into teacher " +
                "values(?,?,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, teacher.getId());
        preparedStatement.setString(2, teacher.getName());
        preparedStatement.setInt(3, teacher.getAge());
        preparedStatement.setDouble(4, teacher.getSalary());
        preparedStatement.execute();
    }

}
