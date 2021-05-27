package com.briup.day.day14.day14.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {

    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        list.addFirst(1);
        list.addFirst(2);

        for (Object o : list) {
            System.out.println(o);
        }

    }

}
