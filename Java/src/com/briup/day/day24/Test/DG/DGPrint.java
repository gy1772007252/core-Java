package com.briup.day.day24.Test.DG;

import java.io.*;

public class DGPrint {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        File file = new File(br.readLine());
        
        getFileAll(file);

    }

    private static void getFileAll(File file) {
        File[] files = file.listFiles();
        for (File f : files) {
            if (f.isDirectory()) {
                getFileAll(f);
            } else {
                System.out.println(f);
            }
        }
    }

}
