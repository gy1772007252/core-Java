package com.briup.day5;

public class ForTwo {

    public static void main(String[] args) {

        //九九乘法表（正常）
        for (int i = 1; i < 10; i++) {
            for (int k = 1; k <= i; k++) {
                System.out.printf(k + "x" + i + "=" + (i * k) + "\t");
            }
            System.out.println();
        }

        System.out.println();

        //九九乘法表（上下反）
        for (int i = 1; i < 10; i++) {
            for (int k = i; k <= 9; k++) {
                System.out.printf(i + "x" + k + "=" + (i * k) + "\t");
            }
            System.out.println();
        }

        System.out.println();

        //九九乘法表（上下左右反）
        for (int i = 1; i < 10; i++) {
            for (int k = i; k <= 9; k++) {
                System.out.printf(i + "x" + k + "=" + (i * k) + "\t");
            }
            System.out.println();
            for (int j = 1; j <= i; j++) {
                System.out.print("\t\t");
            }
        }

        System.out.println();

        //九九乘法表（左右反）
        for (int i = 1; i < 10; i++) {
            for (int j = 9 - i; j >= 1; j--) {
                System.out.print("\t\t");
            }
            for (int k = 1; k <= i; k++) {
                System.out.printf(k + "x" + i + "=" + (i * k) + "\t");
            }
            System.out.println();
        }

        System.out.println();

        //九九乘法表（金字塔）
        for (int i = 1; i < 10; i++) {
            for (int j = 9 - i; j >= 1; j--) {
                System.out.print("\t");
            }
            for (int k = 1; k <= i; k++) {
                System.out.printf(k + "x" + i + "=" + (i * k) + "\t");
            }
            System.out.println();
        }

        System.out.println();

        //九九乘法表（上下左右反）
        for (int i = 1; i < 10; i++) {
            for (int k = i; k <= 9; k++) {
                System.out.printf(i + "x" + k + "=" + (i * k) + "\t");
            }
            System.out.println();
            for (int j = 1; j <= i; j++) {
                System.out.print("\t");
            }
        }

    }

}
