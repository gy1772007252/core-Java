package com.briup.day.day21.day21.Interrupt;

public class Interrupt {

    public static void main(String[] args) {

        Thread thread = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(this.isInterrupted());
                    System.out.println(Thread.interrupted());
                }
                System.out.println("线程结束");
            }
        };

        thread.start();

        thread.interrupt();

    }

}
