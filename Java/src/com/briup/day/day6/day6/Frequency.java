package com.briup.day.day6.day6;

import java.util.Arrays;

//产生100个 1~6 之间的随机整数，统计每个数字出现的次数
public class Frequency {

    public static void main(String[] args) {

        Frequency frequency = new Frequency();
        frequency.One();
        System.out.println();
        frequency.Two();
        System.out.println();
        frequency.Three();

    }

    public void Three() {
        int[] ints = new int[100];
        int[] ints1 = new int[6];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = (int)(Math.random() * 6 + 1);
            ints1[ints[i] - 1]++;
        }
        for (int i = 0; i < ints1.length; i++) {
            System.out.println(i + 1 + ":" + ints1[i] + "%");
        }
    }

    public void Two() {
        int[] ints = new int[100];
        int[] ints1 = new int[6];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = (int)(Math.random() * 6 + 1);
        }
        for (int i = 0; i < ints.length; i++) {
            switch (ints[i]) {
                case 1 :
                    ints1[0]++;
                    break;
                case 2 :
                    ints1[1]++;
                    break;
                case 3 :
                    ints1[2]++;
                    break;
                case 4 :
                    ints1[3]++;
                    break;
                case 5 :
                    ints1[4]++;
                    break;
                case 6 :
                    ints1[5]++;
                    break;
                default:
                    break;
            }
        }
        for (int i = 0; i < ints1.length; i++) {
            System.out.println(i + 1 + ":" + ints1[i] + "%");
        }
    }

    public void One() {
        int[] ints = new int[100];

        for (int i = 0; i < ints.length; i++) {
            ints[i] = (int)(Math.random() * 6 + 1);
        }

        int[] ints1 = new int[6];
        int[] ints2 = new int[6];

        int value1 = 0;

        a : for (int i = 0; i < ints.length; i++) {
            int value = 1;
            boolean b = true;
            for (int k = 0; k < ints1.length; k++) {
                if (ints[i] == ints1[k]) {
                    b = false;
                    break;
                }
            }
            if (b == false) {
                continue a;
            }
            for (int j = i + 1; j < ints.length; j++) {
                if (ints[i] == ints[j]) {
                    value ++;
                }
            }
            ints1[value1] = ints[i];
            ints2[value1] = value;
            value1++;
        }
        for (int i = 0; i < ints1.length; i++) {
            System.out.println(ints1[i] + ":" + ints2[i] + "%");
        }
    }

}
