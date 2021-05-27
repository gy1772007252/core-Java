package com.briup.day.day23.day23.File;

import java.io.*;

public class FileCopy5 {

    public static void main(String[] args) {

        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;

        try {
            bis = new BufferedInputStream(new FileInputStream("src/com/briup/other/背影.txt"));
            bos = new BufferedOutputStream(new FileOutputStream("src/com/briup/other/b1.txt"));

            byte[] bytes = new byte[1024];
            long start = System.currentTimeMillis();
            int len = -1;
            while ((len = bis.read(bytes)) != -1) {
                //System.out.println(new String(chars, 0, len));
                bos.write(bytes, 0, len);
            }
            long end = System.currentTimeMillis();
            System.out.println(end - start);
            bos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bis != null) {
                    bis.close();
                }
                if (bos != null) {
                    bos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }

}
