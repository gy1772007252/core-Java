package com.briup.day.day16.day16;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class StudentTest {

    public static void main(String[] args) {

        Comparator comparator = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Student s1 = (Student) o1;
                Student s2 = (Student) o2;
                return s1.getId() - s2.getId() == 0 ? 0 : s1.getId() - s2.getId();
            }
        };

        Set<Student> set = new TreeSet<>(comparator);
        set.add(new Student(001, "张三", 20));
        set.add(new Student(002, "李四", 20));
        set.add(new Student(003, "王五", 20));
        set.add(new Student(004, "赵六", 20));
        System.out.println(set);

    }

}
