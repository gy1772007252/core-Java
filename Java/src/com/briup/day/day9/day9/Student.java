package com.briup.day.day9.day9;

public class Student {

    private String name;
    private int age;

    public Student() {
        System.out.println("希望大家独立学习，争取苟富贵。");
    }

    public Student (String kk) {
        System.out.println(kk + "我被重载了");
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
}
