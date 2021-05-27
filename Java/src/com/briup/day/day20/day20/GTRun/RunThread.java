package com.briup.day.day20.day20.GTRun;

public class RunThread implements Runnable{

    private boolean flag = false;

    @Override
    public void run() {
        int sum = 0;
        while (sum <= 100) {
            if (flag) {
                //System.out.println("比赛结束......");
                return;
            }

            int index = (int) (Math.random() * 5 + 1);
            sum += index;

            if (sum >= 100) {
                flag = true;
            }

            System.out.println(Thread.currentThread().getName() + "跑了：" + sum + "米");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
