package com.briup.day.day5.day5;

/**
 * 三目运算符
 *  数据类型 变量名 = 逻辑结果 ？ 值1 : 值2
 */
public class ThreeEyes {

    public static void main(String[] args) {

        int a = 10;
        String name = ++a < 10 ? "李四" : "王五";
        System.out.println(name);

        int c = 13, d = 25;
        int f = c > d ? c : d;
        System.out.println(f);

        int g = 100, h = 1000, i = -1;
        g = g > h ? g : h;
        i = g > i ? g : i;
        System.out.println(i);

    }

}
