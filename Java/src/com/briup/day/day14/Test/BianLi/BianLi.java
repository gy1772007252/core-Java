package com.briup.day.day14.Test.BianLi;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class BianLi {

    public static void main(String[] args) {

        List list = new ArrayList();
        for (int i = 0; i < 5; i++) {
            int j = i + 1;
            list.add(j);
        }
        System.out.println(list);

        System.out.println();

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println();

        for (Object o:list) {
            System.out.println(o);
        }

        System.out.println();

        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println();

        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

    }

}
