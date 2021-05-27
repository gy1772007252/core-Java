package com.briup.day.day20.Test.Group;

import java.util.Arrays;

public class GroupThread {

    public static void main(String[] args) {

        ThreadGroup myGroup = new ThreadGroup("MyGroup");
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread t1 = new Thread(myGroup, runnable, "T1");
        Thread t2 = new Thread(myGroup, runnable, "T2");
        Thread t3 = new Thread(myGroup, runnable, "T3");
        Thread t4 = new Thread(myGroup, runnable, "T4");
        Thread t5 = new Thread(myGroup, runnable, "T5");


        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

        System.out.println(myGroup.getName() + "存活个数：" + myGroup.activeCount());

    }

}
