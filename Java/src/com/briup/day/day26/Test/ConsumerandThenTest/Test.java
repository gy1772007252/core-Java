package com.briup.day.day26.Test.ConsumerandThenTest;

import java.util.Arrays;
import java.util.function.Consumer;

public class Test {

    public static void main(String[] args) {

        String[] arr = {"卢本伟,男", "五五开,女", "white,男"};
        Consumer<String[]> consumer1 = (str) -> {
            for (int i = 0; i < str.length; i++) {
                str[i] = "姓名：" + str[i];
            }
        };
        Consumer<String[]> consumer2 = (str) -> {
            for (int i = 0; i < str.length; i++) {
                str[i] = str[i].replace(",", ", 性别：");
            }
        };
        Consumer<String[]> consumer = consumer1.andThen(consumer2);

        new Test().test(arr, consumer);

    }

    private void test(String[] arr, Consumer<String[]> consumer) {
        consumer.accept(arr);
        for (String s : arr) {
            System.out.println(s);
        }
    }

}
