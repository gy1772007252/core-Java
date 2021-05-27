package com.briup.day.day14.Test.Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest {

    public static void main(String[] args) {

        List list = new ArrayList();
        for (int i = 0; i < 10; i++) {
            list.add((int) (Math.random() * 10));
        }
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }

}
