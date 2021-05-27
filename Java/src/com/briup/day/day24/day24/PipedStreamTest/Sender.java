package com.briup.day.day24.day24.PipedStreamTest;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PipedOutputStream;

public class Sender extends Thread{

    private PipedOutputStream pos;

    public Sender() {}
    public Sender(PipedOutputStream pos) {
        this.pos = pos;
    }

    @Override
    public void run() {
        DataOutputStream dos = new DataOutputStream(pos);
        for (int i = 0; i <= 10; i++) {
            try {
                dos.writeInt(i + 9000);
                dos.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
