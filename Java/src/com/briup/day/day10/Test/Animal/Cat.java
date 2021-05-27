package com.briup.day.day10.Test.Animal;

public class Cat extends Animal{

    public Cat(int legs) {
        super(legs);
    }

    @Override
    public void walk() {
        System.out.println("走路");
    }

    @Override
    public void eat() {
        System.out.println("吃鱼");
    }

}
