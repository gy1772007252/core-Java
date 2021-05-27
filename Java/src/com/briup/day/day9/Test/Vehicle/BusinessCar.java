package com.briup.day.day9.Test.Vehicle;

public class BusinessCar extends Vehicle {

    int numberMin = 400, numberMax = 600;
    int number;

    public int getNumberMax() {
        return numberMax;
    }
    public int getNumberMin() {
        return numberMin;
    }

    public BusinessCar(int number) {
        this.number = number;
    }
    public BusinessCar() {}

    public double getsumrent(int days) {
        if (number <= 16) return days * numberMin;
        else if (number > 16) return days * numberMax;
        else return 0.0;
    }

}
