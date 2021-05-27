package com.briup.day.day24.Test.XL;

import java.io.IOException;
import java.io.RandomAccessFile;

public class XunThread extends Thread{

    private RandomAccessFile in;
    private RandomAccessFile out;
    private long start;
    private long end;

    public XunThread() {}
    public XunThread(RandomAccessFile in, RandomAccessFile out, long start, long end) {
        this.in = in;
        this.out = out;
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {

        String name = getName();
        int len = -1;
        byte[] bytes = new byte[1024];

        try {

            while (start < end) {
                synchronized (XunThread.class) {
                    in.seek(start);
                    out.seek(start);
                    len = in.read(bytes);
                    if ((start + len) > end) {
                        len = (int) (end - start);
                        out.write(bytes, 0, len);
                        break;
                    }
                    System.out.println(name + " len:" + len);
                    out.write(bytes, 0, len);
                    start += len;
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
