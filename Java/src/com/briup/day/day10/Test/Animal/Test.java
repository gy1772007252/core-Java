package com.briup.day.day10.Test.Animal;

public class Test {

    public static void main(String[] args) {

        Snake snake = new Snake(0);
        snake.walk();snake.eat();

        Cat cat = new Cat(4);
        cat.walk();cat.eat();

        Fish fish = new Fish(1);
        fish.walk();fish.eat();

    }

}
