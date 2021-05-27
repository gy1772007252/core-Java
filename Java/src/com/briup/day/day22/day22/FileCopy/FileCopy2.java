package com.briup.day.day22.day22.FileCopy;

import java.io.*;

public class FileCopy2 {

    public static void main(String[] args) {

        FileReader fr = null;
        FileWriter fw = null;

        try {
            fr = new FileReader("src/com/briup/other/背影.txt");
            fw = new FileWriter("src/com/briup/other/b1.txt");

            /*int temp = -1;
            while ((temp = fr.read()) != -1) {
                //System.out.print((char) temp);
                fw.write((char) temp);
            }*/

            char[] chars = new char[1024];
            long start = System.currentTimeMillis();
            int len = -1;
            while ((len = fr.read(chars)) != -1) {
                //System.out.println(new String(chars, 0, len));
                fw.write(chars, 0, len);
            }
            long end = System.currentTimeMillis();
            System.out.println(end - start);
            fw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fr != null) {
                    fr.close();
                }
                if (fw != null) {
                    fw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }

}
