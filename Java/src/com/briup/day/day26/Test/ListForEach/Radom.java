package com.briup.day.day26.Test.ListForEach;

import java.util.ArrayList;
import java.util.Collection;

public class Radom {

    public static void main(String[] args) {

        Collection<Integer> collection = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            collection.add((int) (Math.random() * 100 + 1));
        }
        collection.forEach(i -> System.out.print(i + "\t"));
        System.out.println();

        /*Collection<Integer> collectionNew = new ArrayList<>();
        collection.forEach(i -> {
            if (i % 2 == 0) {
                collectionNew.add(i);
            }
        });
        collectionNew.forEach(i -> System.out.print(i + "\t"));*/

        collection.removeIf(num -> num % 2 != 0);
        collection.forEach(i -> System.out.print(i + "\t"));

    }

}
