package com.briup.day.day12.Test.BaoShu;

public class BaoShu {

    public static void main(String[] args) {

        int n = 10;
        boolean[] booleans = new boolean[n];
        for (int i = 0; i < booleans.length; i++) {
            booleans[i] = true;
        }
        int count = n;
        int num = 0;
        int index = 0;
        while(count > 1) {

            if (booleans[index]) {
                num++;
                if (num == 3) {
                    num = 0;
                    booleans[index] = false;
                    count--;
                }
            }
            index++;
            if (index == n) {
                index = 0;
            }

        }
        for (int i = 0; i < booleans.length; i++) {
            if (booleans[i]) {
                System.out.println("剩余的数是：" + (i + 1));
            }
        }

    }

}
