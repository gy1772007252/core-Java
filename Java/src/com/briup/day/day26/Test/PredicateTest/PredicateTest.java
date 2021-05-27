package com.briup.day.day26.Test.PredicateTest;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateTest {

    public static void main(String[] args) {

        String[] arr = { "五五开,女", "white,男", "卢本伟,男"};
        Predicate<String> predicate1 = (str) -> {
            String[] split = str.split(",");
            return split[0].length() == 3;
        };
        Predicate<String> predicate2 = (str) -> {
            String[] split = str.split(",");
            return split[1].equals("男");
        };
        Predicate<String> predicate = predicate1.and(predicate2);

        List<String> list = new PredicateTest().filter(arr, predicate);
        list.forEach((str) -> System.out.print(str + "\t"));

    }

    private List<String> filter(String[] arr, Predicate<String> predicate) {
        List<String> list = new ArrayList<>();
        for (String s : arr) {
            if (predicate.test(s)) {
                list.add(s);
            }
        }
        return list;
    }

}
