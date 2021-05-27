package com.briup.day.day16.day16;

import java.util.*;

public class MapTest {

    public static void main(String[] args) {

        Map<Integer, Student> map = new HashMap<>();
        Student student1 = new Student(1, "张三", 20);
        Student student2 = new Student(2, "李四", 20);
        Student student3 = new Student(3, "王五", 20);
        Student student4 = new Student(4, "赵六", 20);
        map.put(student1.getId(), student1);
        map.put(student2.getId(), student2);
        map.put(student3.getId(), student3);
        map.put(student4.getId(), student4);
        //System.out.println(map);

        //show1(map);
        //show2(map);
        //show3(map);

    }

    //keySet
    public static void show1(Map<Integer, Student> map) {
        Set<Integer> set = map.keySet();
        for (Integer integer : set) {
            System.out.println(integer);
        }
    }
    //value
    public static void show2(Map<Integer, Student> map) {
        Collection<Student> values = map.values();
        for (Student value : values) {
            System.out.println(value);
        }
    }
    //entrySet
    public static void show3(Map<Integer, Student> map) {
        Set<Map.Entry<Integer, Student>> entries = map.entrySet();
        for (Map.Entry<Integer, Student> entry : entries) {
            System.out.println(entry);
        }
//        Iterator<Map.Entry<Integer, Student>> iterator = entries.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
    }

}
