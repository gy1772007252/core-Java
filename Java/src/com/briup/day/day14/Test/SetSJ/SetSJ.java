package com.briup.day.day14.Test.SetSJ;

import java.util.HashSet;
import java.util.Set;

public class SetSJ {

    public static void main(String[] args) {

        Set set = new HashSet();
        while (true) {
            set.add((int) (Math.random() * 20 + 1));
            if (set.size() == 10) {
                break;
            }
        }
        System.out.println(set);

    }

}
