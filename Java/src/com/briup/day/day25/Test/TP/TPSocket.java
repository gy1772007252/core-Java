package com.briup.day.day25.Test.TP;

import java.io.*;
import java.net.Socket;

public class TPSocket {

    public static void main(String[] args) {

        int port = 8888;
        String encoding = "UTF-8";
        String host = "127.0.0.1";

        Socket socket = null;
        BufferedInputStream in = null;
        BufferedReader in1 = null;
        BufferedOutputStream out = null;

        try {

            socket = new Socket(host, port);

            out = new BufferedOutputStream(socket.getOutputStream());
            in = new BufferedInputStream(new FileInputStream("src/com/briup/other/美女.png"));

            byte[] bytes = new byte[1024];
            int len = -1;
            while ((len = in.read(bytes)) != -1) {
                out.write(bytes, 0, len);
                out.flush();
            }
            socket.shutdownOutput();

            in1 = new BufferedReader(new InputStreamReader(socket.getInputStream(), encoding));
            System.out.println(in1.readLine());

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (in1 != null) {
                    in1.close();
                }
                if (out != null) {
                    out.close();
                }
                if (in != null) {
                    in.close();
                }
                if (socket != null) {
                    socket.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }

}
