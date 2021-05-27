package com.briup.day.day21.Test.JTPrint;

public class JTPrint {

    public static int num = 1;
    public static int letter = 'A';
    public static Object o = new Object();

    public static void main(String[] args) {

        Thread num = new Thread("数字") {
            @Override
            public void run() {
                while (true) {
                    synchronized (o) {
                        System.out.print(JTPrint.num);
                        JTPrint.num++;
                        System.out.print(JTPrint.num);
                        JTPrint.num++;
                        try {
                            o.notifyAll();
                            if (JTPrint.num >= 52) {
                                break;
                            }
                            o.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        };
        Thread letter = new Thread("字母") {
            @Override
            public void run() {
                while (true) {
                    synchronized (o) {
                        System.out.print((char) JTPrint.letter);
                        JTPrint.letter++;
                        try {
                            o.notifyAll();
                            if (JTPrint.letter > 'Z') {
                                break;
                            }
                            o.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        };
        num.start();
        letter.start();

    }

}
