package com.briup.day.day5.day5;

public class WhileOne {

    public static void main(String[] args) {

        int i = 1, sum = 0;
        while (i <= 100) {
            sum += i;
            i++;
        }
        System.out.println(sum);

        //死循环
        while (true) {}

    }

}
