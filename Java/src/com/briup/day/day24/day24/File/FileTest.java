package com.briup.day.day24.day24.File;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileTest {

    public static void main(String[] args) {

        File file = new File("src/com/briup/Test");
        //boolean b = file.exists();
        if (!file.exists()) {
            file.mkdir();
        }

        File file1 = new File("src/com/briup/Test/a.txt");
        //File file1 = new File("src/com/briup/Test", "a.txt");
        //File file1 = new File(file, "a.txt");
        //判断文件是否存在
        if (!file1.exists()) {
            try {
                file1.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try {

            FileOutputStream fos = new FileOutputStream(file1);
            fos.write("hello world".getBytes());
            fos.flush();
            fos.close();
            System.out.println(file1.length());
            System.out.println(file1.getAbsolutePath());

            //file1.delete();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
