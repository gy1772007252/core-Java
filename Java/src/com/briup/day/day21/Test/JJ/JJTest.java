package com.briup.day.day21.Test.JJ;

public class JJTest {

    public static void main(String[] args) {

        Thread jia1 = new Thread("jia1") {
            @Override
            public void run() {
                int j = 0;
                while (true) {
                    j++;
                    System.out.println(Thread.currentThread().getName() + " : " + j);
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        Thread jia2 = new Thread("jia2") {
            @Override
            public void run() {
                int j = 0;
                while (true) {
                    j++;
                    System.out.println(Thread.currentThread().getName() + " : " + j);
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        Thread jian1 = new Thread("jian1") {
            @Override
            public void run() {
                int j = 0;
                while (true) {
                    j--;
                    System.out.println(Thread.currentThread().getName() + " : " + j);
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        Thread jian2 = new Thread("jian2") {
            @Override
            public void run() {
                int j = 0;
                while (true) {
                    j--;
                    System.out.println(Thread.currentThread().getName() + " : " + j);
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        jia1.start();
        jia2.start();
        jian1.start();
        jian2.start();

    }

}
