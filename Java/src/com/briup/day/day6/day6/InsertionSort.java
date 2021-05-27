package com.briup.day.day6.day6;

import java.util.Arrays;

/**
 * 插入排序
 */
public class InsertionSort {

    public static void main(String[] args) {

        int[] ints = {9, 5, 3, 4, 6, 7, 8, 1, 2, 0};

        for (int i = 0; i < ints.length - 1; i++) {
            for (int j = i + 1; j  > 0; j--) {
                if (ints[j] < ints[j - 1]) {
                    ints[j] = ints[j] ^ ints[j - 1];
                    ints[j - 1] = ints[j] ^ ints[j - 1];
                    ints[j] = ints[j] ^ ints[j - 1];
                }
            }
            System.out.println(Arrays.toString(ints));
        }

    }

}
