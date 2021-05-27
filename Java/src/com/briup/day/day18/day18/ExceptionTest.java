package com.briup.day.day18.day18;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest {

    public static void main(String[] args) {

        System.out.println("程序开始");
        Scanner scanner = new Scanner(System.in);
        int a = 0;

        try {
            a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println(e + " 除数不能为0");
        } catch (InputMismatchException e) {
            scanner.nextLine();
            int b = scanner.nextInt();
            System.out.println(a / b);
        }

        System.out.println("程序结束");

    }

}
