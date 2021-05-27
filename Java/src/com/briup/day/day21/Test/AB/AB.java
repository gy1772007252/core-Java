package com.briup.day.day21.Test.AB;

public class AB {

    public static void main(String[] args) {

        Object o = new Object();

        Thread A = new Thread("A") {
            @Override
            public void run() {
                while (true) {
                    synchronized (o) {
                        try {
                            o.notify();
                            o.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.print(getName());
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        };
        Thread B = new Thread("B") {
            @Override
            public void run() {
                while (true) {
                    synchronized (o) {
                        try {
                            o.notify();
                            o.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.print(getName());
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        };
        A.start();
        B.start();

    }

}
