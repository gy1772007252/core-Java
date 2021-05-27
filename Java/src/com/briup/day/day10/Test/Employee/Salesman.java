package com.briup.day.day10.Test.Employee;

public class Salesman extends Employee {

    double daySalary;

    public Salesman(double daySalary) {
        this.category = "Salesman";
        this.daySalary = daySalary;
    }

    @Override
    public double computeSalay(int days, double deductAPercentage) {
        System.out.print(getCategory() + "天薪：" + daySalary + "元，本月工作：" + days + "天，月提成：" + deductAPercentage +
                "元");
        return days * daySalary + deductAPercentage;
    }

}
