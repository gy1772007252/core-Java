package com.briup.day.day10.Test.Employee;

public class Worker extends Employee {

    double daysSalary;

    public Worker(double daysSalary) {
        this.category = "Worker";
        this.daysSalary = daysSalary;
    }

    @Override
    public double computeSalay(int days) {
        System.out.print(getCategory() + "天薪：" + daysSalary + "元，本月工作：" + days + "天");
        return days * daysSalary;
    }

}
