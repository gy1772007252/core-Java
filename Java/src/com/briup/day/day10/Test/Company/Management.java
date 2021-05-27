package com.briup.day.day10.Test.Company;

public class Management extends Employee implements Work {

    public Management(String Position) {
        this.Position = Position;
    }

    @Override
    public void Work() {
        System.out.println(getPosition() + "管卖东西的。");
    }

}
