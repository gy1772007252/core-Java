package com.briup.day.day14.Test.RetainAllSet;

import java.util.HashSet;
import java.util.Set;

public class RetainAllSet {

    public static void main(String[] args) {

        Set set1 = new HashSet();
        for (int i = 0; i < 10; i++) {
            set1.add((int) (Math.random() * 10));
        }
        System.out.println(set1);

        Set set2 = new HashSet();
        for (int i = 0; i < 10; i++) {
            set2.add((int) (Math.random() * 10));
        }
        System.out.println(set2);
        set1.retainAll(set2);

        System.out.println(set1);

    }

}
