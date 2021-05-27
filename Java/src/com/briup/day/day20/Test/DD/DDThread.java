package com.briup.day.day20.Test.DD;

public class DDThread {

    public static void main(String[] args) {

        Thread thread = new Thread() {
            @Override
            public void run() {
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    System.out.println("子线程报错");
                }
                System.out.println(Thread.currentThread().getName());
            }
        };
        thread.start();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            System.out.println("主线程报错");
        }
        thread.interrupt();

    }

}
