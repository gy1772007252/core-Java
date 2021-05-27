package com.briup.day.day20.day20.GTRun;

public class GTRun {

    public static void main(String[] args) throws Exception{

        RunThread runThread = new RunThread();
        Thread gui = new Thread(runThread,"乌龟");
        Thread tu = new Thread(runThread,"兔子");

        System.out.println("比赛开始......");
        gui.start();
        tu.start();

        gui.join();
        tu.join();
        System.out.println("比赛结束......");

    }

}
