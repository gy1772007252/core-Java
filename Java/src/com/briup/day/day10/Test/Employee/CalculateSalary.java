package com.briup.day.day10.Test.Employee;

public class CalculateSalary {

    public static void main(String[] args) {

        Employee employee = new Employee();
        employee = new Worker(500);
        System.out.println("，总薪：" + employee.computeSalay(30) + "元。");
        employee = new Salesman(500);
        System.out.println("，总薪：" + employee.computeSalay(30, 5000) + "元。");
        employee = new Manager(50000);
        System.out.println("，总薪：" + employee.computeSalay(12) + "元。");
        employee = new Floater(50);
        System.out.println("，总薪：" + employee.computeSalay(6) + "元。");

    }

}
