package com.briup.day.day20.day20.Daemon;

public class DaemonThread {

    public static void main(String[] args) throws Exception {

        Thread thread = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(i);
                }
            }
        };
        //设置为后台线程
        thread.setDaemon(true);
        thread.start();
        //让thread线程执行
        Thread.sleep(3000);

    }

}
