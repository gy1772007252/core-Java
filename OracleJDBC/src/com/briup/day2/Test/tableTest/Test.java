package com.briup.day2.Test.tableTest;

import com.briup.dom.ConnectionFactoryByPool;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * 获取数据库的所有表，并对查询的结果进行封装；
 */
public class Test {

    private static Connection connection;

    static {
        try {
            connection = ConnectionFactoryByPool.getConnection();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void main(String[] args) {

        try {

            List<Table> list = getDataBase();
            list.forEach(System.out::println);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private static List<Table> getDataBase() throws Exception{
        List<Table> list = new ArrayList<>();
        PreparedStatement ps = connection.prepareStatement("select table_name from user_tables");
        ResultSet resultSet = ps.executeQuery();
        while (resultSet.next()) {
            //获取表名
            Table table = new Table();
            String name = resultSet.getString(1);
            table.setName(name);

            //获取表信息
            PreparedStatement ps1 = connection.prepareStatement("select * " +
                    "from " + name);
            ResultSet resultSet1 = ps1.executeQuery();

            //结果集元数据
            ResultSetMetaData metaData = resultSet1.getMetaData();
            int columnCount = metaData.getColumnCount();
            List<Column> columns = new ArrayList<>();
            for (int i = 1; i <= columnCount; i++) {
                Column column = new Column();
                column.setName(metaData.getColumnName(i));
                column.setType(metaData.getColumnClassName(i));
                //获取列是否为空
                column.setRequire(ResultSetMetaData.columnNoNulls == metaData.isNullable(i));
                columns.add(column);
            }
            table.setColumns(columns);
            list.add(table);
        }
        return list;
    }

}
