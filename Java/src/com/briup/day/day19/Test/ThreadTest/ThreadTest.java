package com.briup.day.day19.Test.ThreadTest;

public class ThreadTest {

    public static void main(String[] args) {

        Thread t = new Thread() {
            @Override
            public void run() {
                String name = Thread.currentThread().getName();
                System.out.println(name);
            }
        };
        t.start();
        t.run();

    }

}
