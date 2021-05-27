package com.briup.day.day5.day5;

/**
 * import java.lang.Math;
 */

public class Random {

    public static void main(String[] args) {

        //alt + enter 万能键
        double random = Math.random();
        // 产生 0 - 9 随机整数
        System.out.println((int)(random * 10));
        // 产生 10 - 20 随机整数
        System.out.println((int)(random * 10 + 10));

    }

}
