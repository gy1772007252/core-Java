package com.briup.day.day24.day24.CharArray;

import java.io.CharArrayReader;
import java.io.CharArrayWriter;

public class CharArrayTest {

    public static void main(String[] args) {

        CharArrayWriter caw = null;
        CharArrayReader car = null;

        try {

            caw = new CharArrayWriter();
            caw.write("hello world");
            char[] buff = caw.toCharArray();
            System.out.println(new String(buff));

            car = new CharArrayReader(buff);
            char[] cbuff = new char[100];
            int len = car.read(cbuff);
            System.out.println(new String(cbuff, 0, len));

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
