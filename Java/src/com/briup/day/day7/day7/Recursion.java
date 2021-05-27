package com.briup.day.day7.day7;

import java.util.Scanner;

public class Recursion {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int product = 1;
        for (int j = scanner.nextInt(); j > 0; j--) {
            product *= j;
        }
        System.out.println(product);

    }

}
