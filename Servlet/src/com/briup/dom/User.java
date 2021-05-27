package com.briup.dom;

public class User {

    String name;
    String pwd;

    public User() {}
    public User(String name, String pwd) {
        this.name = name;
        this.pwd = pwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Override
    public String toString() {
        return "User{" +
                "name:" + name + "\t\t" +
                "pwd:" + pwd +
                "}";
    }
}
