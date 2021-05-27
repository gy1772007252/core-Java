package com.briup.day.day10.Test.Animal;

public abstract class Animal {

    int legs;

    public Animal(int legs) {
        this.legs = legs;
    }

    public abstract void walk();
    public abstract void eat();

}