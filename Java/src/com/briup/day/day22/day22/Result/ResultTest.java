package com.briup.day.day22.day22.Result;

public class ResultTest {

    public static void main(String[] args) {

        Result result = new Result();
        Sender sender1 = new Sender("生产者1", result);
        Sender sender2 = new Sender("生产者2", result);
        Printer printer1 = new Printer("消费者1", result);
        Printer printer2 = new Printer("消费者2", result);

        printer1.start();
        printer2.start();
        sender1.start();
        sender2.start();

    }

}
