package com.briup.day.day5.day5;

import java.util.Scanner;

public class IfElse {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double score = scanner.nextDouble();
        if (score > 90) {
            System.out.println("优秀");
        } if (score < 60){
            System.out.println("非常优秀");
        } else {
            System.out.println("差");
        }

    }

}
