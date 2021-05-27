package com.briup.day.day14.day14.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {

    public static void main(String[] args) {

        //hashset本质是用hashmap实现,hashmap又是由hash表实现的
        Set set = new HashSet();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);
        System.out.println(set);

    }

}
