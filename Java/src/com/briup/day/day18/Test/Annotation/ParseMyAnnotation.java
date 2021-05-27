package com.briup.day.day18.Test.Annotation;

import java.lang.reflect.Method;

public class ParseMyAnnotation {

    public static void main(String[] args) throws Exception{

        new ParseMyAnnotation().parse();

    }

    @MyTest
    public void mytest() {
        System.out.println("这是MyTest");
    }

    @MyBefore
    public void mybefore() {
        System.out.println("这是MyBefore");
    }

    @MyAfter
    public void myafter() {
        System.out.println("这是MyAfter");
    }

    public void parse() throws Exception{

        Class clz = Class.forName("Test.Annotation.ParseMyAnnotation");
        ParseMyAnnotation parseMyAnnotation = (ParseMyAnnotation) clz.newInstance();
        Method[] methods = clz.getMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(MyBefore.class)) {
                method.invoke(parseMyAnnotation);
            }
        }
        for (Method method : methods) {
            if (method.isAnnotationPresent(MyTest.class)) {
                method.invoke(parseMyAnnotation);
            }
        }
        for (Method method : methods) {
            if (method.isAnnotationPresent(MyAfter.class)) {
                method.invoke(parseMyAnnotation);
            }
        }

    }

}
