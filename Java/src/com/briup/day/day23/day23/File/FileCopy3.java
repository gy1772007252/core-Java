package com.briup.day.day23.day23.File;

import java.io.*;

public class FileCopy3 {

    public static void main(String[] args) {

        BufferedReader br = null;
        BufferedWriter bw = null;

        try {
            br = new BufferedReader(new FileReader("src/com/briup/other/背影.txt"));
            bw = new BufferedWriter(new FileWriter("src/com/briup/other/b1.txt"));

            char[] chars = new char[1024];
            long start = System.currentTimeMillis();
            int len = -1;
            while ((len = br.read(chars)) != -1) {
                //System.out.println(new String(chars, 0, len));
                bw.write(chars, 0, len);
            }
            long end = System.currentTimeMillis();
            System.out.println(end - start);
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
                if (bw != null) {
                    bw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }

}
