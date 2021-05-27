package com.briup.day.day10.Test.Company;

public class Logistics extends Employee implements Work {

    public Logistics(String Position) {
        this.Position = Position;
    }

    @Override
    public void Work() {
        System.out.println(getPosition() + "给卖东西的、管卖东西的打辅助");
    }

}
