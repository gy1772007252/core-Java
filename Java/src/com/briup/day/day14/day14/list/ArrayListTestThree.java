package com.briup.day.day14.day14.list;

import java.util.*;

public class ArrayListTestThree {

    public static void main(String[] args) {

        List list = new ArrayList();
        list.add(1);
        list.add(true);
        list.add("恶心");
        System.out.println(list.subList(1, 3));

        //迭代器, 不能再迭代的过程中进行添加、删除
        Iterator iterator = list.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //List集合的迭代器, 可以进行添加和删除
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

    }

}
