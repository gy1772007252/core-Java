package com.briup.day.day16.Test.TeacherTest;

import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TeacherTest {

    public static void main(String[] args) {

        Set<Teacher> set = new TreeSet<>();
        Collections.addAll(set, new Teacher(1, "张三", 20),
                new Teacher(2, "李四", 20),
                new Teacher(3, "王五", 20),
                new Teacher(4, "赵六", 20),
                new Teacher(5, "张三", 18),
                new Teacher(6, "张三", 20));
        System.out.println(set);

        Set<Teacher> set1 = new TreeSet<>(new Comparator<Teacher>() {
            @Override
            public int compare(Teacher o1, Teacher o2) {
                return o1.getName().compareTo(o2.getName()) == 0 ? (o1.getAge() - o2.getAge() == 0 ? o1.getId() - o2.getId() : o1.getAge() - o2.getAge()) : o1.getName().compareTo(o2.getName());
            }
        });
        Collections.addAll(set1, new Teacher(1, "张三", 20),
                new Teacher(2, "李四", 20),
                new Teacher(3, "王五", 20),
                new Teacher(4, "赵六", 20),
                new Teacher(5, "张三", 18),
                new Teacher(6, "张三", 20));
        System.out.println(set1);

    }

}
