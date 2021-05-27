package com.briup.day.day22.day22.Result;

public class Sender extends Thread{

    private Result result;

    public Sender() {}
    public Sender(String name, Result result) {
        super(name);
        this.result = result;
    }

    @Override
    public void run() {
        int sum = 0;
        for (int i = 1; i < 101; i++) {
            sum += i;
        }
        result.setData(sum);
    }

}
