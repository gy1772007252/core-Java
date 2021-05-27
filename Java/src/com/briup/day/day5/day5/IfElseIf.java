package com.briup.day.day5.day5;

import java.util.Scanner;

public class IfElseIf {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double score = scanner.nextDouble();
        if (score > 100) {
            System.out.println("作弊");
        } else if (score >= 90 && score <= 100) {
            System.out.println("优秀");
        } else if (score >= 80 && score < 90) {
            System.out.println("良好");
        } else if (score >= 70 && score < 80) {
            System.out.println("一般");
        } else if (score >= 60 && score < 70) {
            System.out.println("及格");
        } else {
            System.out.println("没有资格参加考试");
        }

    }

}
