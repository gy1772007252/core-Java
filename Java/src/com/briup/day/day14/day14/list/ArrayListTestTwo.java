package com.briup.day.day14.day14.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTestTwo {

    public static void main(String[] args) {

        List list = new ArrayList();
        list.add(1);
        list.add(true);
        list.add("恶心");
        //Object o = list.remove(2);
        //Object o = list.remove(true);
        //System.out.println(o);
        System.out.println(list);

        list.set(2, "恶心心");
        System.out.println(list);

        //包含某元素
        System.out.println(list.contains(true));


        list.add("恶心");
        list.add("恶心");
        list.add("恶心");
        list.add("恶心");
        //得到第一次出现的索引位置
        System.out.println(list.indexOf("恶心"));
        //得到最后一次出现的索引位置
        System.out.println(list.lastIndexOf("恶心"));

//        list.clear();
//        System.out.println(list);

//        List l = new ArrayList();
//        l.add(1);
//        l.add(true);
//        list.removeAll(l);//删除两集合的交集
//        System.out.println(list);

    }

}
