package com.briup.day.day23.Test.FileThread;

import java.io.InputStream;
import java.io.PipedOutputStream;

public class PipedWriteThread extends Thread{

    private PipedOutputStream pos;

    public PipedWriteThread() {}
    public PipedWriteThread(PipedOutputStream pos) {
        this.pos = pos;
    }

    @Override
    public void run() {
        try {
            InputStream is = System.in;
            while (true) {
                int i = is.read();
                if (i == 10) {
                    return;
                }
                pos.write(i);
                pos.flush();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (pos != null) {
                    pos.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

}
