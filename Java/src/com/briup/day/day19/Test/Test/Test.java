package com.briup.day.day19.Test.Test;

import java.lang.reflect.Method;
import java.util.ArrayList;

public class Test {

    public static void main(String[] args) throws Exception {

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(6);
        Class c = ArrayList.class;
        Method add = c.getMethod("add", Object.class);
        add.invoke(arrayList, "abcd");
        System.out.println(arrayList);

    }

}
