package com.briup.day.day14.Test.PaiXu;

import java.util.*;

public class PaiXu {

    public static void main(String[] args) {

        Set set = new TreeSet();
        new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Integer i1 = (Integer) o1;
                Integer i2 = (Integer) o2;
                if (i1 % 2 != 0 && i2 % 2 != 0) {
                    return i1 - i2;
                }
                if (i1 % 2 == 0 && i2 % 2 == 0) {
                    return -(i1 - i2);
                }
                if (i1 % 2 != 0 && i2 % 2 == 0) {
                    return -1;
                }
                if (i1 % 2 == 0 && i2 % 2 != 0) {
                    return 1;
                }
                return 0;
            }
        };
        set.add(1);
        set.add(4);
        set.add(3);
        set.add(2);

        System.out.println(set);

    }

}
