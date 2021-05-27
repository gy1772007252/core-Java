package com.briup.day.day18.Test.User;

import java.util.Objects;

public class User {

    protected int id;
    public String name;
    private String password;

    boolean checkName(String name) {
        if (this.name.equals(name)) {
            return true;
        }
        return false;
    }
    public User getName(String name) {
        return new User();
    }
    public void doSomeThing() {}
    public void doSomeThing(String name, String password) {
        this.name = name;
        this.password = password;
    }
    public void doSomeThing(int id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id &&
                Objects.equals(name, user.name) &&
                Objects.equals(password, user.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, password);
    }

}
