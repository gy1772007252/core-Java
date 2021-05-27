package com.briup.day.day13.day13;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ColletionList {

    public static void main(String[] args) {

        Collection c = new ArrayList();
        c.add("sss");
        c.add(true);
        c.add(1);
        c.add(new String());

        for (Object o: c) {
            System.out.println(o);
        }

    }

}
