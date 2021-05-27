package com.briup.day.day20.Test.GTRun;

public class GTRun {

    public static void main(String[] args) throws Exception{

        Thread gui = new MyThread("乌龟") {
            private int sum = 0;
            @Override
            public void run() {
                while(sum <= 100) {
                    if (MyThread.flag) {
                        break;
                    }
                    if (Math.random() >= 0.3) {
                        sum += 1;
                        System.out.println(Thread.currentThread().getName() + "跑了：" + sum + "米");
                    }
                    if (sum >= 100) {
                        MyThread.flag = true;
                    }
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        Thread tu = new MyThread("兔子") {
            private int sum = 0;
            @Override
            public void run() {
                while(sum <= 100) {
                    if (MyThread.flag) {
                        break;
                    }
                    if (Math.random() < 0.3) {
                        sum += 2;
                        System.out.println(Thread.currentThread().getName() + "跑了：" + sum + "米");
                    }
                    if (sum >= 100) {
                        MyThread.flag = true;
                    }
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        System.out.println("比赛开始......");
        gui.start();
        tu.start();

        gui.join();
        tu.join();
        System.out.println("比赛结束......");

    }

    abstract static class MyThread extends Thread{

        private static boolean flag = false;

        public MyThread() {}
        public MyThread(String name) {
            super(name);
        }
        @Override
        public abstract void run();

    }
}
