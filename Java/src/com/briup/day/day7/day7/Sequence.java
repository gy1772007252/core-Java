package com.briup.day.day7.day7;

import java.util.Arrays;
import java.util.Scanner;

public class Sequence {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] ints = new int[scanner.nextInt()];
        ints[0] = 1;
        ints[1] = 1;
        for (int i = 2; i < ints.length; i++) {
            ints[i] = ints[i - 2] + ints[i - 1];
        }
        System.out.println(Arrays.toString(ints));

    }

}
