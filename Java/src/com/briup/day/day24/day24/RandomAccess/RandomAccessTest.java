package com.briup.day.day24.day24.RandomAccess;

import java.io.File;
import java.io.RandomAccessFile;

public class RandomAccessTest {

    public static void main(String[] args) {

        RandomAccessFile raf = null;

        try {

            File file = new File("src/com/briup/Test/a.txt");
            raf = new RandomAccessFile(file, "rw");
            //raf.writeUTF("hello world");

            raf.seek(6);//跳过n个字节
            //System.out.println(raf.readLine());
            raf.write("briup 123".getBytes());

            raf.seek(0);
            System.out.println(raf.readLine());

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
