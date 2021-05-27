package com.briup.day.day20.Test.SXprint;

public class SXprint {

    public static void main(String[] args) throws InterruptedException {

        MyThread myThread = new MyThread();
        Thread T1 = new Thread(myThread, "T1");
        Thread T2 = new Thread(myThread, "T2");
        Thread T3 = new Thread(myThread, "T3");

        T1.start();
        T1.join();
        T2.start();
        T2.join();
        T3.start();
        T3.join();

    }

}
