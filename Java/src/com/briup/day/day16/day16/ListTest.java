package com.briup.day.day16.day16;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListTest {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add((int) (Math.random() * 10 + 1));
        }
        System.out.println(list);
        int sum = 0;
        for (Integer integer: list) {
            sum += integer;
        }
//        for (int i = 0; i < list.size(); i++) {
//            sum += list.get(i);
//        }
//        Iterator<Integer> iterator = list.iterator();
//        while (iterator.hasNext()) {
//            sum += iterator.next();
//        }
        System.out.println(sum);

    }

}
