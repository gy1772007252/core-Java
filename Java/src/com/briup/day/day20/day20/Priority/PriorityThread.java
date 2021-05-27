package com.briup.day.day20.day20.Priority;

public class PriorityThread {

    public static void main(String[] args) {

        Thread thread1 = new Thread("张三") {
            @Override
            public void run() {
                for (int i = 0; i < 1000000; i++) {
                    System.out.println("----------" + Thread.currentThread().getName() + i);
                }
            }
        };
        Thread thread2 = new Thread("李四") {
            @Override
            public void run() {
                for (int i = 0; i < 1000000; i++) {
                    System.out.println(Thread.currentThread().getName() + i);
                }
            }
        };
        thread1.setPriority(8);
        thread2.setPriority(2);
        thread1.start();
        thread2.start();


    }

}
