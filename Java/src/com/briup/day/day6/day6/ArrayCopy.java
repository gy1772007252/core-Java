package com.briup.day6;

public class ArrayCopy {

    public static void main(String[] args) {

        int[] arr = {6, 7, 8, 9};
        int[] dest = new int[arr.length * 3];
        System.arraycopy(arr, 0, dest, 0, arr.length);

        arr = dest;

        for (int i = 0; i < dest.length; i++) {
            System.out.print(arr[i] + " ");
        }



    }

}
