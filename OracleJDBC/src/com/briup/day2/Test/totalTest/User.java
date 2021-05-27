package com.briup.day2.Test.totalTest;

public class User {

    private String name;

    public User() {}
    public User(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "\n\t\t\t姓名：" + name + "\t";
    }
}
