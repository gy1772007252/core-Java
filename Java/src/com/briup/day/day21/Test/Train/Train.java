package com.briup.day.day21.Test.Train;

public class Train {

    public static void main(String[] args) {

        TrainThread tt = new TrainThread();
        Thread t1 = new Thread(tt);
        Thread t2 = new Thread(tt);
        Thread t3 = new Thread(tt);
        Thread t4 = new Thread(tt);
        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }

}
