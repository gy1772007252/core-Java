package com.briup.day.day10.Test.Animal;

public class Fish extends Animal {

    public Fish(int legs) {
        super(legs);
    }

    @Override
    public void walk() {
        System.out.println("游泳");
    }

    @Override
    public void eat() {
        System.out.println("吃饵");
    }

}
