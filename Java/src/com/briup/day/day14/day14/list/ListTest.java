package com.briup.day.day14.day14.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListTest {

    public static void main(String[] args) {

        List list = new ArrayList();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            list.add(0, i);
        }
        long end = System.currentTimeMillis();
        System.out.println("ArrayList时间" + (end - start));

        list = new LinkedList();
        start = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            list.add(0, i);
        }
        end = System.currentTimeMillis();
        System.out.println("LinkedList时间" + (end - start));

    }

}
