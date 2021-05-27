package com.briup.day.day10.Test.Company;

public class Employee {

    String Position;

    public Employee() {}

    public void GoToWark() {
        System.out.println(getPosition() + "上班");
    }
    public void GoOffWork() {
        System.out.println(getPosition() + "下班");
    }

    public String getPosition() {
        return Position;
    }

}
