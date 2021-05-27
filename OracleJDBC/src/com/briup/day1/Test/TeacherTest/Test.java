package com.briup.day1.Test.TeacherTest;

import com.briup.dom.ConnectionFactory;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

public class Test {

    private static Connection connection = ConnectionFactory.getConnection();
    private static Statement statement;

    static {
        try {
            statement = connection.createStatement();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    private static Map<Integer, Teacher> map = new HashMap<>();

    public static void main(String[] args) {
        try {
            create();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        //menu();

        try {
            if (connection != null) {
                connection.close();
            }
            if (statement != null) {
                statement.close();
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

    private static void menu() {

        Scanner scanner = new Scanner(System.in);
        boolean b = true;

        while (b) {
            System.out.println();
            System.out.println("1--添加老师信息");
            System.out.println("2--删除老师信息");
            System.out.println("3--更改老师信息");
            System.out.println("4--查询老师信息");
            System.out.println("5--查询所有老师信息");
            System.out.println("6--插入表格");
            System.out.println("0--退出系统");
            System.out.print("请输入选项：");
            int i = scanner.nextInt();
            scanner.nextLine();
            switch (i) {
                case 1:
                    insert();
                    break;
                case 2:
                    delete();
                    break;
                case 3:
                    update();
                    break;
                case 4:
                    select();
                    break;
                case 5:
                    selectAll();
                    break;
                case 6:
                    insertB();
                    break;
                case 0:
                    b = false;
                    break;
                default:
                    System.out.println("请输入：1~4！");
                    break;
            }
        }

    }

    private static void selectAll() {
        Set<Integer> integers = map.keySet();
        for (Integer integer : integers) {
            System.out.println(map.get(integer));
        }
    }

    private static void insertB() {
        Teacher teacher = null;
        try {
            statement = connection.createStatement();
            Set<Integer> integers = map.keySet();
            for (Integer integer : integers) {
                teacher = map.get(integer);
                String sql = "insert into teacher " +
                        "values(" + teacher.getId() + ",'" + teacher.getName() + "'," + teacher.getAge() + "," + teacher.getSalary() +
                        ")";
                statement.addBatch(sql);
            }
            statement.executeBatch();
        } catch (SQLException throwables) {
            System.out.print(teacher.getName() + " ");
            map.remove(teacher.getId());
            System.out.println("该信息已存在!");
        }
    }

    private static void select() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入要查找的老师id：");
        String id = scanner.nextLine();
        System.out.println(map.get(Integer.parseInt(id)));
    }

    private static void update() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入要更改的老师id：");
        String id = scanner.nextLine();
        String name = map.get(Integer.parseInt(id)).getName();
        System.out.print("请输入要更改的老师年龄：");
        String age = scanner.nextLine();
        System.out.print("请输入要更改的老师工资：");
        String salary = scanner.nextLine();
        map.put(Integer.parseInt(id), new Teacher(Integer.parseInt(id), name, Integer.parseInt(age), Double.valueOf(salary)));
    }

    private static void delete() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入要删除的老师id：");
        String id = scanner.nextLine();
        map.remove(Integer.parseInt(id));
    }

    private static void insert() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入老师id：");
        String id = scanner.nextLine();
        System.out.print("请输入老师姓名：");
        String name = scanner.nextLine();
        System.out.print("请输入老师年龄：");
        String age = scanner.nextLine();
        System.out.print("请输入老师工资：");
        String salary = scanner.nextLine();
        map.put(Integer.parseInt(id), new Teacher(Integer.parseInt(id), name, Integer.parseInt(age), Double.valueOf(salary)));
    }

    private static void create() throws SQLException {
        statement = connection.createStatement();
        String sql = "create table teacher( " +
                "id number primary key, " +
                "name varchar2(10) not null, " +
                "age number(2), " +
                "salary number " +
                ")";
        statement.execute(sql);
    }

}
