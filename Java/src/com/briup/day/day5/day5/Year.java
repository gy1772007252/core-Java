package com.briup.day.day5.day5;

import java.util.Scanner;

public class Year {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println("该年份为闰年");
        } else {
            System.out.println("该年份为平年");
        }

    }

}
