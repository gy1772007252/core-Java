package com.briup.day.day22.day22.FileCopy;

import java.io.*;

public class FileCopy {

    public static void main(String[] args) {

        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream("src/com/briup/other/a.txt");
            fos = new FileOutputStream("src/com/briup/other/b.txt");

            /*int temp = -1;
            while ((temp = fis.read()) != -1) {
                //System.out.print(temp);
                fos.write(temp);
            }*/

            byte[] bytes = new byte[20];
            int len = -1;
            while ((len = fis.read(bytes)) != -1) {
                //System.out.println(new String(bytes, 0, len));
                fos.write(bytes, 0, len);
            }
            fos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
                if (fos != null) {
                    fos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

}
