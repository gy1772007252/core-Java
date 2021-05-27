package com.briup.day.day10.Test.Animal;

public class Snake extends Animal {

    public Snake(int legs) {
        super(legs);
    }

    @Override
    public void walk() {
        System.out.println("爬行");
    }

    @Override
    public void eat() {
        System.out.println("吃猫");
    }

}
