package com.briup.day.day23.Test.FileThread;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/**
 * 没解决
 */
public class Test {

    public static void main(String[] args) throws IOException {

        PipedInputStream pis = new PipedInputStream();
        PipedOutputStream pos = new PipedOutputStream(pis);
        Thread t1 = new PipedReadThread(pis);
        Thread t2 = new PipedWriteThread(pos);
        t1.start();
        t2.start();

    }

}
