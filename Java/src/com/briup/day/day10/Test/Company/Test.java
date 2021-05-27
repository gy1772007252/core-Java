package com.briup.day.day10.Test.Company;

public class Test {

    public static void main(String[] args) {

        Employee employee = new Employee();
        employee = new Sell("销售");
        employee.GoToWark();
        Sell sell = (Sell) employee;
        sell.Work();
        employee.GoOffWork();

        System.out.println();

        employee = new Management("管理");
        employee.GoToWark();
        Management management = (Management) employee;
        management.Work();
        employee.GoOffWork();

        System.out.println();

        employee = new Logistics("后勤");
        employee.GoToWark();
        Logistics logistics = (Logistics) employee;
        logistics.Work();
        employee.GoOffWork();

    }

}
