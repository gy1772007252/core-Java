package com.briup.day.day23.day23.Employee;

import sun.dc.pr.PRError;

import java.io.Serializable;

//该接口起标识该类可以序列化和反序列化
public class Employee implements Serializable {

    private static final long serialVersionUID = 1l;

    private int id;
    private String name;
    //transient不会被序列化和反序列化
    private transient double salary;
    private int score;

    public Employee() {}
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        this.score = score;
    }
}
