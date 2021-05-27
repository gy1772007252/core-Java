package com.briup.day2.day2;

import com.briup.dom.ConnectionFactoryByPool;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MetaDateTest {

    private static Connection connection;
    private static DatabaseMetaData metaData;

    static {
        try {
            connection = ConnectionFactoryByPool.getConnection();
            metaData = connection.getMetaData();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void main(String[] args) {

        try {

            getDatabaseProduct();
            getT();
            getC();


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

    /**
     * 获得列
     * @throws SQLException
     */
    private static void getC() throws SQLException {
        ResultSet columns = metaData.getColumns(null, "BRIUP", "H_USER", null);
        while (columns.next()) {
            String colName = columns.getString("COLUMN_NAME");
            String typeNmae = columns.getString("TYPE_NAME");
            System.out.println(colName + ":" + typeNmae);
        }
    }

    /**
     * 获得表
     * @throws SQLException
     */
    private static void getT() throws SQLException {
        ResultSet tables = metaData.getTables(null, "BRIUP", null, new String[]{"TABLE"});
        while (tables.next()) {
            String tableName = tables.getString("TABLE_NAME");
            String typeNmae = tables.getString("TABLE_TYPE");
            System.out.println(tableName + ":" + typeNmae);
        }
    }

    /**
     * 获得环境名
     * @throws SQLException
     */
    private static void getDatabaseProduct() throws SQLException {
        System.out.println(metaData.getDatabaseProductName());
        System.out.println(metaData.getDatabaseProductVersion());
    }

}
