package com.briup.day.day14.Test.ScoreTom;

import java.util.Set;
import java.util.TreeSet;

public class ScoreTom {

    public static void main(String[] args) {

        Set set = new TreeSet();
        set.add(new Person("张三", 90));
        set.add(new Person("李四", 80));
        set.add(new Person("王五", 100));
        set.add(new Person("赵六", 75));
        set.add(new Person("tom", 10));
        System.out.println(set);

    }

}
