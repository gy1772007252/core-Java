package com.briup.day.day26.Test.ListForEach;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class QC {

    public static void main(String[] args) {

        Collection<String> collection = new ArrayList<>();
        collection.add("abcd");
        collection.add("efg");
        collection.add("abcd");

        collection.forEach(i -> System.out.print(i + "\t"));
        System.out.println();

        /*Collection<String> collectionNew = new ArrayList<>();
        collection.forEach(s -> {
            if (!collectionNew.contains(s)) {
                collectionNew.add(s);
            }
        });
        collectionNew.forEach(i -> System.out.print(i + "\t"));*/

        Set<String> set = new HashSet<>();
        collection.forEach(i -> set.add(i));
        set.forEach(i -> System.out.print(i + "\t"));

    }



}
