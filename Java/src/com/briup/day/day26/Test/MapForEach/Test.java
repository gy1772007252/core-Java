package com.briup.day.day26.Test.MapForEach;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class Test {

    public static void main(String[] args) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.put(i++, i++);
        }
        map.forEach((i, j) -> System.out.println(i + ":" + j));
        //BiConsumer biConsumer = (integer, integer2) -> System.out.println(integer + ":" + integer2);
        //map.forEach(biConsumer);

    }

}
