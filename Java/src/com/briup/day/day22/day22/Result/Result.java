package com.briup.day.day22.day22.Result;

public class Result {

    private int data;
    private boolean isWait = false;

    public void setData(int data) {
        this.data += data;
        while (!this.isWait()) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        synchronized (this) {
            this.notify();
        }
    }

    public int getData() {
        int temp = 0;
        synchronized (this) {
            try {
                this.setWait(true);
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            temp = data;
            this.data = 0;
        }
        return temp;
    }

    public void setWait(boolean wait) {
        isWait = wait;
    }
    public boolean isWait() {
        return isWait;
    }

}
