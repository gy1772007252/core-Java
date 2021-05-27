package com.briup.day.day16.Test.MapStudent;

import java.util.*;

public class MapStudent {

    Map<Integer, Student> map = new HashMap();
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        MapStudent mapStudent = new MapStudent();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1.add");
            System.out.println("2.delete");
            System.out.println("3.selectAll");
            System.out.println("4.select");
            System.out.println("0.exit");

            System.out.print("请输入：");

            int i = scanner.nextInt();
            scanner.nextLine();
            switch (i) {
                case 1 :
                    mapStudent.add();
                    break;
                case 2 :
                    mapStudent.delete();
                    break;
                case 3 :
                    mapStudent.selectAll();
                    break;
                case 4 :
                    mapStudent.select();
                    break;
                default:
                    System.out.println("请输入0 ~ 4之间的数字!");
                    break;
            }

        }

    }

    private void selectAll() {
        Set<Map.Entry<Integer, Student>> entries = map.entrySet();
        Iterator<Map.Entry<Integer, Student>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, Student> next = iterator.next();
            System.out.println(next.getValue());
        }
    }

    private void delete() {
        System.out.print("请输入删除的学生学号:");
        Integer integer = scanner.nextInt();
        if (map.containsKey(integer)) {
            System.out.println(map.remove(integer) + "已删除");
        } else {
            System.out.println("该学生不存在");
        }
    }

    private void select() {
        System.out.print("请输入查询的学生学号:");
        Integer integer = scanner.nextInt();
        if (map.containsKey(integer)) {
            System.out.println(map.get(integer));
        } else {
            System.out.println("该学生不存在");
        }
    }

    private void add() {
        Student student = new Student();
        System.out.print("请输入姓名:");
        String name = scanner.nextLine();
        student.setName(name);
        System.out.print("请输入学号:");
        Integer id = scanner.nextInt();
        scanner.nextLine();
        student.setId(id);
        map.put(id, student);
        System.out.println(map);
    }

}
