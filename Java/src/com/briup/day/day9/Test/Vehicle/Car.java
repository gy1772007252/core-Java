package com.briup.day.day9.Test.Vehicle;

public class Car extends Vehicle {

    String model1 = "twoCar", model2 = "threeCar", model3 = "offRoad";
    int twoCar = 300, threeCar = 350, offRoad = 500;
    String model;
    int money;

    public int getTwoCar() {
        return twoCar;
    }
    public int getThreeCar() {
        return threeCar;
    }
    public int getOffRoad() {
        return offRoad;
    }

    public Car(String model) {
        this.model = model;
    }
    public Car(){}

    public double getsumrent(int days) {
        if (model.equals(model1)) return days * this.twoCar;
        else if (model.equals(model2)) return days * this.threeCar;
        else if (model.equals(model3)) return days * this.offRoad;
        else return 0.0;
    }

}
