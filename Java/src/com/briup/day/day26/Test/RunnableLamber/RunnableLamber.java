package com.briup.day.day26.Test.RunnableLamber;

public class RunnableLamber {

    public static void main(String[] args) {

        new Thread(() -> System.out.println(Thread.currentThread().getName())).start();

    }

}
