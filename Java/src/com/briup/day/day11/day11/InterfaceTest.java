package com.briup.day.day11.day11;

public class InterfaceTest implements StudentInterface{

    public static void main(String[] args) {

        new InterfaceTest().test();

    }

    @Override
    public void test() {
        System.out.println("哈哈");
    }

}
