package com.briup.day.day15.day15.TreeSet;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {

    public static void main(String[] args) {

        Set set = new TreeSet();
        set.add(new Person("lsii", 15));
        set.add(new Person("wangwu", 16));
        set.add(new Person("lsii1", 14));
        set.add(new Person("wangwu", 17));
        set.add(new Person("lsii2", 13));
        set.add(new Person("wangwu", 18));
        System.out.println(set);

    }

}
