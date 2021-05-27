package com.briup.day.day6.day6;

import java.util.Arrays;

public class ArraysTest {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6};
        String value = Arrays.toString(arr);
        System.out.println(value);

        int[] arr1 = {arr.length};
        arr1 = Arrays.copyOf(arr, arr.length);
        String value1 = Arrays.toString(arr1);
        System.out.println(value1);

        Arrays.sort(arr);//排序
        int i = Arrays.binarySearch(arr, 5);//取下标
        System.out.println(i);
        for (int value2 : arr) {
            System.out.print(value2 + " ");
        }
        System.out.println();

        boolean equals = Arrays.equals(arr, arr1);//判断俩数组是否相等，必须下标和内容均相等；
        System.out.println(equals);

    }

}
