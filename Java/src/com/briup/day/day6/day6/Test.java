package com.briup.day.day6.day6;

public class Test {

    public static void main(String[] args) {

        //金字塔
        for (int i = 1; i <= 5; i++) {

            for (int j = 0; j < 5 - i; j++) {

                System.out.print(" ");

            }

            for (int k = 1; k <= 2 * i - 1; k++) {

                System.out.print("*");

            }

            System.out.println();

        }

        System.out.println();

        //倒金字塔
        for (int i = 5; i >= 1; i--) {

            for (int k = 1; k <= 2 * i - 1; k++) {

                System.out.print("*");

            }

            System.out.println();

            for (int j = 0; j <= 5 - i; j++) {

                System.out.print(" ");

            }

        }

    }

}
