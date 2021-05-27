package com.briup.day.day15.day15.TreeSet;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetTestTwo {

    public static void main(String[] args) {

        Set set = new TreeSet(new TeacherComparator());
        set.add(new Teacher("zahngsan3", 20));
        set.add(new Teacher("zahngsan1", 20));
        set.add(new Teacher("zahngsan2", 20));
        set.add(new Teacher("lisi", 30));
        set.add(new Teacher("wangwu", 40));
        System.out.println(set);

    }

}
