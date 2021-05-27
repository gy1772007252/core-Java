package com.briup.day.day23.day23.File;

import java.io.*;

public class FileCopy4 {

    public static void main(String[] args) {

        BufferedReader br = null;
        BufferedWriter bw = null;
        PrintWriter pw = null;//建议用

        try {
            br = new BufferedReader(new FileReader("src/com/briup/other/背影.txt"));
            //bw = new BufferedWriter(new FileWriter("src/com/briup/other/b2.txt"));
            pw = new PrintWriter("src/com/briup/other/b3.txt");

            long start = System.currentTimeMillis();

            String line = null;
            while ((line = br.readLine()) != null) {

                pw.println(line);//好用

                /*//一行一行的换
                bw.write(line);
                bw.newLine();*/
            }

            long end = System.currentTimeMillis();
            System.out.println(end - start);
            pw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
                if (pw != null) {
                    pw.close();
                }
                /*if (bw != null) {
                    bw.close();
                }*/
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }

}
