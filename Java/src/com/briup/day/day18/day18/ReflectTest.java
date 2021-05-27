package com.briup.day.day18.day18;

import java.io.FileInputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Properties;

public class ReflectTest {

    public static void main(String[] args) throws Exception {

        //key, value存放数据为String类型，继承于Map
        Properties properties = new Properties();
        properties.load(new FileInputStream("src/com/briup/day18/info.properties"));
        String className = properties.getProperty("className");
        Class clz = Class.forName(className);

        Book book = (Book) clz.newInstance();

        String methodName = properties.getProperty("methodName");
        Method method = clz.getDeclaredMethod(methodName);
        method.invoke(book);

        properties.getProperty("fieldName");
        Field field = clz.getDeclaredField("name");
        field.setAccessible(true);
        field.set(book, "antushen");
        System.out.println(field.get(book));

        System.out.println(properties);

    }

}
