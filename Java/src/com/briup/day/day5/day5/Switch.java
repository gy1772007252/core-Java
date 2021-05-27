package com.briup.day.day5.day5;

import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();

        switch (value) {
            case 1:
                System.out.println("这是一个1");
                break;
            case 2:
                System.out.println("这是一个2");
                break;
            case 3:
                System.out.println("这是一个3");
                break;
            default:
                System.out.println("这是默认的妃子");
                break;
        }

    }

}
