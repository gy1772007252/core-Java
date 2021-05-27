package com.briup.day.day14.Test.ListSJ;

import java.util.ArrayList;
import java.util.List;

public class ListSJ {

    public static void main(String[] args) {

        List list = new ArrayList();
        for (int i = 0; i < 20; i++) {
            list.add((int) (Math.random() * 10));
        }
        System.out.println(list);

        List list1 = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            int j = (int) list.get(i);
            if (j % 2 == 0) {
                list1.add(j);
            }
        }
        System.out.println(list1);

    }

}
