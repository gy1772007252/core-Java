package com.briup.day.day10.Test.Company;

public class Sell extends Employee implements Work {

    public Sell(String Position) {
        this.Position = Position;
    }

    @Override
    public void Work() {
        System.out.println(getPosition() + "卖东西。");
    }

}
