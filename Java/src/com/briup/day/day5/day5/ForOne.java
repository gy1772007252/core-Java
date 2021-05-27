package com.briup.day5;

import java.util.Scanner;

public class ForOne {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println(sum);

        int result = 1;
        for (int i = 1; i <= 50; i++) {
            result *= i;
        }
        System.out.println(result);

        //死循环
        for (;;){}

    }

}
