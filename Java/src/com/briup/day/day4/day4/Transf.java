package com.briup.day.day4.day4;

/**
 * 类型转换
 *
 *  隐式类型转换
 *      小比特位类型转换为大比特位类型
 *  显式类型转换
 *      大比特位类型转换为小比特位类型
 *      数据类型 变量名 = （数据类型）变量；
 */
public class Transf {

    public static void main(String[] args) {

        byte a = 1;
        int b = a + 1;

        byte d = (byte)128;
        long f = 3;
        int h = (int)f;
        System.out.println(d);
        System.out.println(h);

        Object o = new Person();
        Person p = (Person) new Object();

    }

}
