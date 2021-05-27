package com.briup.day.day24.day24.PipedStreamTest;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class PipedStreamTest {

    public static void main(String[] args) {

        PipedOutputStream pos = new PipedOutputStream();
        PipedInputStream pis = new PipedInputStream();

        //将管道流连接
        try {
            pos.connect(pis);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Sender sender = new Sender(pos);
        Printer printer = new Printer(pis);
        sender.start();
        printer.start();

    }

}
