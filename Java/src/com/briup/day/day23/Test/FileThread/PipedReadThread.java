package com.briup.day.day23.Test.FileThread;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;

public class PipedReadThread extends Thread{

    private PipedInputStream pis;

    public PipedReadThread() {}
    public PipedReadThread(PipedInputStream pis) {
        this.pis = pis;
    }

    @Override
    public void run() {
        try {
            OutputStream os = new FileOutputStream("src/com/briup/day/day23/Test/FileThread/文件.txt", true);
            int len = -1;
            while ((len = pis.read()) != -1) {
                os.write(len);
                os.flush();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
