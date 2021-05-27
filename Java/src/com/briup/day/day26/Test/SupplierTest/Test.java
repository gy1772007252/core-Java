package com.briup.day.day26.Test.SupplierTest;

import java.util.function.Supplier;

public class Test {

    public static void main(String[] args) {

        Supplier<Integer> supplier = () -> {
            int[] arr = {2, 3, 4, 52, 333, 23};
            int max = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (max < arr[i]) {
                    max = max ^ arr[i];
                    arr[i] = max ^ arr[i];
                    max = max ^ arr[i];
                }
            }
            return max;
        };
        System.out.println(supplier.get());

    }

}
