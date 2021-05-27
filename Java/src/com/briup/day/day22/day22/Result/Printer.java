package com.briup.day.day22.day22.Result;

public class Printer extends Thread{

    private Result result;

    public Printer() {}
    public Printer(String name, Result result) {
        super(name);
        this.result = result;
    }

    @Override
    public void run() {
        int sum = result.getData();
        //result.setData(0);
        System.out.println(getName() + "拿到产品:" + sum);
    }

}
