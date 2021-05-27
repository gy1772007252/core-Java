package com.briup.day.day24.Test.Object;


import java.awt.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectStream {

    public static void main(String[] args) throws Exception{

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/com/briup/day/day24/Test/Object/list.txt"));

        MyList myList = new MyList();
        myList.add("你好");
        myList.add("世界");
        oos.writeObject(myList);
        oos.flush();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/com/briup/day/day24/Test/Object/list.txt"));
        MyList myList1 = (MyList) ois.readObject();
        System.out.println(myList1);
        for (Object o : myList1) {
            System.out.println(o);
        }

        if (oos != null) {
            oos.close();
        }
        if (ois != null) {
            ois.close();
        }

    }

}
