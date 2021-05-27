package com.briup.day6;

import java.util.Scanner;

public class ArrayAverage {

    public static void main(String[] args) {

        //平均值
        int[] ints = {1, 2, 3, 4, 5, 6};
        double avg = 0.0;
        int sum = 0;
        for (int value : ints) {
            sum += value;
        }
        avg = sum / (ints.length * 1.0);
        System.out.println(avg);

        //最大值
        int max = ints[0];
        for (int i = 1; i < ints.length; i++) {
            if (max < ints[i]) {
                max = ints[i];
            }
        }
        System.out.println(max);

    }

}
