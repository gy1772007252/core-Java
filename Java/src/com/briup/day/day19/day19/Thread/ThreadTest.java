package com.briup.day.day19.day19.Thread;

public class ThreadTest {

    public static void main(String[] args) {

        Thread thread1 = new Thread() {
            @Override
            public void run() {
                try {
                    sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("run1");
            }
        };
        Thread thread2 = new Thread() {
            @Override
            public void run() {
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("run2");
            }
        };
        thread1.start();
        thread2.start();

    }

}
