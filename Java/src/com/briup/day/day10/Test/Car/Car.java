package com.briup.day.day10.Test.Car;

public class Car {

    String brand;

    public Car(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public String goCompany() {
        System.out.println("正在前往公司...");
        return "到公司了";
    }

}
