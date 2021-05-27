package com.briup.day.day16.Test.GenericsTest;

import java.util.*;

public class GenericsTest {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        print(list);

        Set<Float> set = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            set.add((float) i);
        }
        print(set);

    }

    private static void print(Collection<? extends Number> collection) {
        Iterator<? extends Number> iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}
