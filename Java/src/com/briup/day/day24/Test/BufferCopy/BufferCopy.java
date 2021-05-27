package com.briup.day.day24.Test.BufferCopy;

import java.io.*;

public class BufferCopy {

    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new FileReader("src/com/briup/other/背影.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("src/com/briup/day/day24/Test/BufferCopy/a.txt"));

        int len = -1;
        char[] chars = new char[1024];
        while ((len = br.read(chars)) != -1) {
            bw.write(chars, 0, len);
            bw.flush();
        }

    }

}
