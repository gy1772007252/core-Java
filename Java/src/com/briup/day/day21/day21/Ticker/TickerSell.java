package com.briup.day.day21.day21.Ticker;

public class TickerSell implements Runnable {

    public Object object = new Object();

    @Override
    public void run() {
        while (Ticker.b) {
            synchronized (object) {

                if (Ticker.num <= 0) {
                    Ticker.b = false;
                }
                System.out.println(Thread.currentThread().getName() + "正在出售第" + Ticker.num + "张票");
                Ticker.num--;
            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
