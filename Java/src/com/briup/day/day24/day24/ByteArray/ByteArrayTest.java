package com.briup.day.day24.day24.ByteArray;

import com.sun.scenario.animation.shared.ClipEnvelope;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

public class ByteArrayTest {

    public static void main(String[] args) {

        ByteArrayOutputStream baos = null;
        ByteArrayInputStream bais = null;
        try {
            byte[] str = "hello".getBytes();
            baos = new ByteArrayOutputStream();
            baos.write(str);
            baos.flush();
            byte[] buff = baos.toByteArray();
            System.out.println(new String(buff));

            byte[] msg = "hello world".getBytes();
            bais = new ByteArrayInputStream(msg);
            byte[] b = new byte[100];
            int len = bais.read(b);
            System.out.println(new String(b, 0, len));

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
