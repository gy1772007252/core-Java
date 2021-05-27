package com.briup.day.day21.Test.Dead;

public class Dead implements Runnable{
    @Override
    public void run() {
        show1();
        show2();
    }
    private synchronized void show1() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        show2();
    }
    private synchronized void show2() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        show1();
    }
}
