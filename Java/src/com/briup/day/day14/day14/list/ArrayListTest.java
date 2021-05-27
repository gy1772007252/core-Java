package com.briup.day.day14.day14.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArrayListTest {

    public static void main(String[] args) {

        List list = new ArrayList();
        list.add(1);
        list.add(true);
        list.add("sss");
        list.add(new ListTest());
        list.add(2, "wangwu");

        /**
         *集合遍历：
         * 1.通过索引获取数据， 从0开始
         */
        Object o = list.get(0);
        System.out.println(o);

        //获取集合中所有元素个数
        int i = list.size();
        System.out.println(i);

        for (int j = 0; j < list.size(); j++) {
            System.out.println(list.get(j));
        }

        //增强for
        for (Object o1 : list) {
            System.out.println(o1);
        }

        //copy
        List ll = new ArrayList();
        ll.add(1);
        ll.add(2);
        ll.addAll(1, list);

        for (Object o1 : ll) {
            System.out.println(o1);
        }



    }

}
