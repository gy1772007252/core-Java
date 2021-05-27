package com.briup.dom;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.function.Function;

public class JdbcUtils {

    private static DataSource dataSource;

    static {
        try {
            Properties properties = new Properties();
            properties.load(JdbcUtils.class.getClassLoader().getResourceAsStream("druid.properties"));
            dataSource = DruidDataSourceFactory.createDataSource(properties);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws SQLException {
        return dataSource.getConnection();
    }

    public static void close(ResultSet resultSet, Statement statement, Connection connection) {
        try {
            if (resultSet != null) {
                resultSet.close();
            }
            if (statement != null) {
                statement.close();
            }
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void close(Statement statement, Connection connection) {
        close(null, statement, connection);
    }

    public static int executeUpdate(String sql) {
        int rows = 0;

        Connection connection = null;
        Statement statement = null;
        try {
            connection = getConnection();
            statement = connection.createStatement();
            rows = statement.executeUpdate(sql);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            close(statement, connection);
        }
        return rows;
    }

    public static <T> T queryForObject(String sql, Function<ResultSet, T> f) {
        T t = null;

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            connection = getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
            t = f.apply(resultSet);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            close(resultSet, statement, connection);
        }
        return t;
    }

    /*public static <T> Object queryForOne(String sql, Class<T> clazz) {
        return queryForList(sql, clazz).get(0);
    }*/

    public static <T> List<T> queryForList(String sql, Class<T> clazz) {
        List<T> result = new ArrayList<>();

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            connection = getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
            List<TypeAndName> list = parse(clazz);

            T obj = null;

            while (resultSet.next()) {
                obj = clazz.newInstance();
                for (TypeAndName typeAndName : list) {
                    if ("double".equals(typeAndName.type)) {
                        double value = resultSet.getDouble(typeAndName.name);
                        typeAndName.invokeSet(obj, double.class, value);
                    } else if ("String".equals(typeAndName.type)) {
                        String value = resultSet.getString(typeAndName.name);
                        typeAndName.invokeSet(obj, String.class, value);
                    } else if ("int".equals(typeAndName.type)) {
                        int value = resultSet.getInt(typeAndName.name);
                        typeAndName.invokeSet(obj, int.class, value);
                    }
                }
                result.add(obj);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(resultSet, statement, connection);
        }
        return result;
    }

    private static <T> List<TypeAndName> parse(Class<T> clazz) {
        Field[] declaredFields = clazz.getDeclaredFields();
        List<TypeAndName> list = new ArrayList<>();
        for (int i = 0; i < declaredFields.length; i++) {
            Field field = declaredFields[i];
            String name = field.getName();
            String type = field.getType().getSimpleName();
            list.add(new TypeAndName(type, name));
        }
        return list;
    }

    private static class TypeAndName {
        String type;
        String name;
        public TypeAndName(String type, String name) {
            this.type = type;
            this.name = name;
        }

        public <T> void invokeSet(Object obj, Class<T> c, Object value) {
            try {
                Method method = obj.getClass().getDeclaredMethod("set" + initCap(name), c);
                method.invoke(obj, value);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        private String initCap(String name) {
            return name.substring(0, 1).toUpperCase() + name.substring(1);
        }
    }

}
