package com.briup.day.day23.day23.Data;

import java.io.*;

public class DataCopy {

    public static void main(String[] args) {

        DataInputStream dis = null;
        DataOutputStream dos = null;
        try {

            dis = new DataInputStream(new FileInputStream("src/com/briup/other/c.txt"));
            dos = new DataOutputStream(new FileOutputStream("src/com/briup/other/c.txt"));

            dos.writeInt(1);
            dos.writeBoolean(true);
            dos.writeDouble(10.4D);
            dos.writeUTF("hello world");

            int i = dis.readInt();
            boolean b = dis.readBoolean();
            double d = dis.readDouble();
           String s = dis.readUTF();
            System.out.println(i);
            System.out.println(b);
            System.out.println(d);
            System.out.println(s);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }  catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (dis != null) {
                    dis.close();
                }
                if (dos != null) {
                    dos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }

}
