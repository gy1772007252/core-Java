package com.briup.day.day24.Test.JC;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;

public class JCAa {

    public static void main(String[] args) throws Exception{

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("src/com/briup/day/day24/Test/JC/a.txt"));

        int A = 0;
        int a = 0;

        while (true) {
            int read = bis.read();
            if (read == -1) {
                break;
            }
            if (read == 'A') {
                A++;
            }
            if (read =='a') {
                a++;
            }
        }
        System.out.println("A出现的个数:" + A + ", a出现的个数:" + a);

    }

}
