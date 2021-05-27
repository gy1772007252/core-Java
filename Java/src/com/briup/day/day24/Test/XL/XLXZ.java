package com.briup.day.day24.Test.XL;


import java.io.File;
import java.io.RandomAccessFile;

public class XLXZ {

    public static void main(String[] args) throws Exception{

        RandomAccessFile in = null;
        RandomAccessFile out = null;

        File file = new File("src/com/briup/day/day24/Test/XL/a.txt");
        long length = file.length();

        in = new RandomAccessFile(file, "r");
        out = new RandomAccessFile("src/com/briup/day/day24/Test/XL/b.txt", "rw");

        XunThread t1 = new XunThread(in, out, 0, length / 2);
        XunThread t2 = new XunThread(in, out, length / 2,length );
        t1.start();
        t2.start();

        t1.join();
        t2.join();

        in.close();
        out.close();

    }

}
