package com.briup.day.day24.Test.FileWork;

import java.io.*;

public class FileWork {

    public static void main(String[] args) throws Exception{

        File file = new File(("src/com/briup/day/day24/Test/FileWork/a.txt"));
        File file1 = new File(("src/com/briup/day/day24/Test/FileWork/b.txt"));
        RandomAccessFile raf = new RandomAccessFile(file, "rw");
        RandomAccessFile raf1 = new RandomAccessFile(file1, "rw");
        ByteArrayOutputStream bais = new ByteArrayOutputStream();
        ByteArrayOutputStream bais1 = new ByteArrayOutputStream();

        int len = -1;
        byte[] bytes = new byte[1024];
        int i = 0;
        raf.read(bytes);

        for (int j = 0; j < bytes.length; j++) {
            if (bytes[j] == '*') {
                raf.seek(j + 12);
                i = j;
                break;
            }
        }

        bytes = new byte[1024];
        while ((len = raf.read(bytes)) != -1) {
            bais.write(bytes, 0, len);
        }
        bytes = new byte[1024];
        while ((len = raf1.read(bytes)) != -1) {
            bais1.write(bytes, 0, len);
        }

        raf.seek(i);
        raf.write(bais1.toByteArray());
        raf.write(bais.toByteArray());

    }

}
