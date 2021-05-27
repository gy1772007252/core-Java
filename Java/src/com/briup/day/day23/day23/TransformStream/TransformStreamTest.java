package com.briup.day.day23.day23.TransformStream;

import java.io.*;

public class TransformStreamTest {

    public static void main(String[] args) {

        BufferedReader br = null;
        BufferedWriter bw = null;
        PrintWriter pw = null;

        try {

            br = new BufferedReader(new InputStreamReader(new FileInputStream("src/com/briup/other/test.txt"), "UTF-8"));
            bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("src/com/briup/other/test1.txt"), "UTF-8"));
            pw = new PrintWriter(new OutputStreamWriter(new FileOutputStream("src/com/briup/other/test.txt"), "UTF-8"));
            pw.println("你好 程序员");
            pw.flush();
            System.out.println(br.readLine());

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
