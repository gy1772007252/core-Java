package com.briup.day.day18.Test.User;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class Test {

    public static void main(String[] args) {

        try {
            new Test().test1();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            new Test().test2();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void test2() throws Exception{
        Class clz = Class.forName("Test.User.User");
        Method[] methods = clz.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }
        for (Method m : methods) {
            System.out.println("-------------------------------");
            System.out.println("方法修饰符：" + Modifier.toString(m.getModifiers()));
            System.out.println("方法返回类型：" + m.getReturnType().getSimpleName());
            System.out.println("方法名称：" + m.getName());
            System.out.println("方法参数个数：" + m.getParameterCount());
            System.out.println("\t" + Arrays.toString(m.getParameterTypes()));
            Class[] exceptionArr = m.getExceptionTypes();
            System.out.println("方法抛出异常个数：" + exceptionArr.length);
            System.out.println("\t" + Arrays.toString(exceptionArr));
        }
        System.out.println("-------------------------------");
        User user = (User) clz.newInstance();
        Method method = clz.getMethod("toString");
        Object o = method.invoke(user);
        System.out.println(o);

        Method doSomeThing = clz.getDeclaredMethod("doSomeThing", int.class, String.class, String.class);
        doSomeThing.invoke(user, 001, "zhangsan", "123456");
        System.out.println(user);

    }

    public void test1() throws Exception {
        Class clz = Class.forName("Test.User.User");
        Field[] fields = clz.getDeclaredFields();
        System.out.println(Arrays.toString(fields));
        for (Field f : fields) {
            System.out.println("属性的修饰符："+ Modifier.toString(f.getModifiers()));
            System.out.println("属性的类型：" + f.getType().getName());
            System.out.println("属性的名称：" + f.getName());
            System.out.println("---------------------");
        }
        User user = (User) clz.newInstance();
        Field field = clz.getDeclaredField("name");
        field.set(user, "张三");
        System.out.println(field.get(user));
        System.out.println();
    }

}
