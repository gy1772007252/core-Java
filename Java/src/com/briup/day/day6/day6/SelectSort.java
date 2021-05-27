package com.briup.day.day6.day6;

import java.util.Arrays;

/**
 * 选择排序
 */
public class SelectSort {

    public static void main(String[] args) {

        int[] ints = {9, 5, 3, 4, 6, 7, 8, 1, 2, 0};
        for (int i = 0; i < ints.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < ints.length; j++) {
                if (ints[min] > ints[j]) {
                    min = j;
                }
            }
            if (min != i) {
                ints[i] = ints[i] ^ ints[min];
                ints[min] = ints[i] ^ ints[min];
                ints[i] = ints[i] ^ ints[min];
            }
            System.out.println(Arrays.toString(ints));
        }

    }

}
