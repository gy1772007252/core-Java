package com.briup.day.day9.Test.Vehicle;

public class CarRental {

    public static void main(String[] args) {

        Car car = new Car();
        System.out.println("两厢：" + car.getTwoCar() + "元/天，三厢：" + car.getThreeCar() + "元/天，越野：" + car.getOffRoad() + "元/天。");
        Car twoCar = new Car("twoCar");
        System.out.println(twoCar.getsumrent(10));
        Car ThreeCar = new Car("threeCar");
        System.out.println(ThreeCar.getsumrent(10));
        Car offRoad = new Car("offRoad");
        System.out.println(offRoad.getsumrent(10));

        BusinessCar businessCar = new BusinessCar();
        System.out.println("座位数<=16：" + businessCar.getNumberMin() + "元/天，座位数>16：" + businessCar.getNumberMax() + "元/天。");
        BusinessCar businessCar1 = new BusinessCar(10);
        System.out.println(businessCar1.getsumrent(10));
        BusinessCar businessCar2 = new BusinessCar(20);
        System.out.println(businessCar2.getsumrent(10));

    }

}
