package com.briup.day.day14.Test.ContaiinsCF;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ContainsCF {

    public static void main(String[] args) {

        List list = new ArrayList();
        for (int i = 0; i < 20; i++) {
            list.add((int) (Math.random() * 10));
        }
        System.out.println(list);
        List list1 = new ArrayList();
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object o = iterator.next();
            if (!list1.contains(o)) {
                list1.add(o);
            }
        }
        list = list1;
        System.out.println(list);

    }

}
