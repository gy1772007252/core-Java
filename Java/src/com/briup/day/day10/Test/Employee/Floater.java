package com.briup.day.day10.Test.Employee;

public class Floater extends Employee {

    double hourSalary;

    public Floater(double hourSalary) {
        this.category = "Floater";
        this.hourSalary = hourSalary;
    }

    @Override
    public double computeSalay(int hour) {
        System.out.print(getCategory() + "时薪：" + hourSalary + "元，今日工作：" + hour + "小时");
        return hour * hourSalary;
    }
}
