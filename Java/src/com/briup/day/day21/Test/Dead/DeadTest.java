package com.briup.day.day21.Test.Dead;

public class DeadTest {

    public static void main(String[] args) {

        Runnable runnable = new Dead();
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        thread1.start();
        thread2.start();

    }

}
