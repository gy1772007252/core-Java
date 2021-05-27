package com.briup.day.day24.day24.StanderSystem;

import java.io.InputStream;
import java.io.OutputStream;

public class StanderSystemTest {

    public static void main(String[] args) {

        InputStream is = null;
        OutputStream os = null;

        try {

            is = System.in;
            os = System.out;

            byte[] buff = new byte[100];

            boolean b = true;
            String temp = "";

            while (!temp.equals("quit")) {
                int len = is.read(buff);
                os.write(buff, 0, len);
                os.flush();
                temp = new String(buff, 0, len).trim();
            }

        } catch (Exception e) {

        }

    }

}
