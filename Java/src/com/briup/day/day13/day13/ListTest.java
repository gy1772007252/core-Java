package com.briup.day.day13.day13;

import java.util.Collection;

public class ListTest {

    public static void main(String[] args) {

        List list = new ArrayList(10);
        list.removeALL();
        list.add("student");
        list.add(true);
        list.add(1);
        list.forEach();
        list.remove(1);
        list.forEach();

    }

}
