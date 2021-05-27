package com.briup.day.day24.day24.PipedStreamTest;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.PipedInputStream;

public class Printer extends Thread {

    private PipedInputStream pis;

    public Printer() {}
    public Printer(PipedInputStream pis) {
        this.pis = pis;
    }

    @Override
    public void run() {
        DataInputStream dis = new DataInputStream(pis);
        for (int i = 0; i <= 10; i++) {
            try {
                System.out.println(dis.readInt());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
