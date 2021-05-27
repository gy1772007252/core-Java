package com.briup.day.day21.day21.Ticker;

public class Test {

    public static void main(String[] args) {

        TickerSell ts = new TickerSell();
        Thread t1 = new Thread(ts);
        Thread t2 = new Thread(ts);
        Thread t3 = new Thread(ts);
        t1.start();
        t2.start();
        t3.start();

    }

}
