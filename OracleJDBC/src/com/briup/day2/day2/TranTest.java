package com.briup.day2.day2;

import com.briup.dom.ConnectionFactory;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 事务处理
 * try {
 *  connection.setAutoCommit(false);
 *  执行sql
 *  connection.commit();
 * } catch (SQLException throwables) {
 *  throwables.printStackTrace();
 *  connection.rollback();
 * }
 */
public class TranTest {

    public static void main(String[] args) {

        Connection connection = ConnectionFactory.getConnection();
        try {
            Statement statement = connection.createStatement();
            String sql = "insert into h_user " +
                    "values(1, 'tom', '123456', '男', 20)";
            //String sql1 = "update h_user set na = '132'";
            try {
                connection.setAutoCommit(false);
                statement.execute(sql);
                //statement.execute(sql1);
                connection.commit();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
                connection.rollback();
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

}
