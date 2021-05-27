package com.briup.day.day23.day23.Employee;

import java.io.*;

public class EmployeeTest {

    public static void main(String[] args) {

        ObjectInputStream ois = null;
        ObjectOutputStream oos = null;

        try {

            ois = new ObjectInputStream(new FileInputStream("src/com/briup/other/emp.txt"));
            oos = new ObjectOutputStream(new FileOutputStream("src/com/briup/other/emp.txt"));
            Employee e1 = new Employee(1, "张三", 10000);
            Employee e2 = new Employee(2, "李四", 10000);
            oos.writeObject(e1);
            oos.writeObject(e2);
            oos.flush();

            Object o1 = ois.readObject();
            Object o2 = ois.readObject();
            System.out.println(o1);
            System.out.println(o2);

        } catch (IOException e) {
            e.printStackTrace();
        }  catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (oos != null) {
                    oos.close();
                }
                if (ois != null) {
                    ois.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

}
