package com.briup.day.day27.Test.ArrayListStream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArrayListStream {

    public static void main(String[] args) {

        List<String> list1 = new ArrayList<>();
        Collections.addAll(list1, "张三", "李四子", "王瘸子", "赵耳朵", "王老五");
        List<String> list2 = new ArrayList<>();
        Collections.addAll(list2, "张二狗", "张麻子", "张五", "赵六", "张六", "张七");

        List<String> listNew1 = list1.stream()
                .filter(e -> e.length() == 3)
                .limit(3)
                .collect(Collectors.toList());
        Stream<String> stream1 = listNew1.stream();
        //stream1.forEach(System.out::println);

        List<String> listNew2 = list2.stream()
                .filter(e -> e.substring(0, 1).equals("张"))
                .skip(2)
                .collect(Collectors.toList());
        Stream<String> stream2 = listNew2.stream();
        //stream2.forEach(System.out::println);

        List<String> collect = Stream.concat(stream1, stream2)
                .collect(Collectors.toList());
        //collect.forEach(System.out::println);

        A a = Person :: new;
        List<Person> list = new ArrayList<>();
        collect.forEach(e -> list.add(a.a(e)));

        list.forEach(System.out::println);
    }

}

interface A {
    Person a(String str);
}
