package com.briup.day.day10.Test.Car;

public class driveCar {

    public static void main(String[] args) {

        Person 张三 = new Person("张三", 30);
        Car 奔驰 = new Car("奔驰");

        System.out.println(张三.getName() + "开着" + 奔驰.getBrand());
        System.out.println(奔驰.goCompany());

    }

}
