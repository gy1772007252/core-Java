package com.briup.day.day24.Test.FZ;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class FZData {

    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new FileReader("src/com/briup/day/day24/Test/FZ/a.txt"));
        PrintWriter pw;

        List list = new ArrayList();
        int i = 0;
        String s = "";
        while (true) {
            s = br.readLine();
            if (s == null) {
                break;
            }
            list.add(i, s);
            i++;
        }
        pw = new PrintWriter(new FileWriter("src/com/briup/day/day24/Test/FZ/a.txt"));
        for (int j = list.size() - 1; j >= 0; j--) {
            pw.write((String) list.get(j) + "\n");
            pw.flush();
        }

    }

}
