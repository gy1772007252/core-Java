package com.briup.day.day20.Test.ZTprint;

public class ZTprint {

    public static void main(String[] args) {

        Thread thread = new Thread("张三") {
            @Override
            public void run() {
                    System.out.println(Thread.currentThread().getName());
                    try {
                        Thread.sleep(100);
                        System.out.println(Thread.currentThread().getState());
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
            }
        };

        System.out.println(thread.getState());

        thread.start();

    }

}
