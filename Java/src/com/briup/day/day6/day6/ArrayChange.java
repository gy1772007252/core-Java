package com.briup.day6;

import java.util.Arrays;

public class ArrayChange {

    public static void main(String[] args) {

        //淘汰
        int[] arr = {1, 2, 3, 4, 5, 6};
        int[] target = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            target[target.length - i - 1] = arr[i];
        }
        arr = target;
        String s = Arrays.toString(arr);
        System.out.println(s);

        //优秀
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        for (int i = 0; i < arr1.length / 2; i++) {
            arr1[i] = arr1[i] ^ arr1[arr1.length - i - 1];
            arr1[arr1.length - i - 1] = arr1[i] ^ arr1[arr1.length - i - 1];
            arr1[i] = arr1[i] ^ arr1[arr1.length - i - 1];
        }
        String s1 = Arrays.toString(arr1);
        System.out.println(s1);

    }

}
