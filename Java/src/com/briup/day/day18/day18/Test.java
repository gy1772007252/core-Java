package com.briup.day.day18.day18;

import java.lang.reflect.Method;

public class Test {

    public static void main(String[] args) throws Exception {

        new Test().test("com.briup.day18.Book", "print");

    }

    public Object test(String className, String methodName) throws Exception {
        Class clz = Class.forName(className);
        Object o = clz.newInstance();
        Method method = clz.getMethod(methodName);
        return method.invoke(o);
    }

}
