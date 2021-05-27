package com.briup.day.day18.Test.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Test {

    public static void main(String[] args) throws Exception {

        Class clz = Class.forName("Test.Person.Person");
        Constructor constructor = clz.getConstructor(String.class, int.class);
        Person person = (Person) constructor.newInstance("张三", 20);
        System.out.println(person);
        Method setName = clz.getMethod("setName", String.class);
        setName.invoke(person, "李四");
        System.out.println(person);

    }

}
