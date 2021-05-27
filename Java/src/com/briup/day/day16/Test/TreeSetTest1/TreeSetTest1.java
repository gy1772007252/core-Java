package com.briup.day.day16.Test.TreeSetTest1;

import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest1 {

    public static void main(String[] args) {

        Set<String> set = new TreeSet<>();
        Collections.addAll(set, "HashSet", "ArrayList", "TreeMap",
                "HashMap", "TreeSet", "LinkedList");
        System.out.println("升序" + set);

        Set<String> set1 = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return -o1.compareTo(o2);
            }
        });
        Collections.addAll(set1, "HashSet", "ArrayList", "TreeMap",
                "HashMap", "TreeSet", "LinkedList");
        System.out.println("降序" + set1);

    }

}
