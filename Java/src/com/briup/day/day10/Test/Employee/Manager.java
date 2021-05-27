package com.briup.day.day10.Test.Employee;

public class Manager extends Employee {

    double monthSalary;

    public Manager(double monthSalary) {
        this.category = "Manager";
        this.monthSalary = monthSalary;
    }

    @Override
    public double computeSalay(int month) {
        System.out.print(getCategory() + "月薪：" + monthSalary + "元，本年工作：" + month + "月");
        return month * monthSalary;
    }

}
