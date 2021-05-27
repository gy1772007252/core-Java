package com.briup.day.day21.Test.Train;

public class TrainThread implements Runnable{

    private static int num = 50;
    private Object o = new Object();

    @Override
    public void run() {
        while (num > 0) {
            synchronized (o) {
                if (num == 0) {
                    return;
                }
                System.out.println(Thread.currentThread().getName() + "卖出了第" + num-- + "张票");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
