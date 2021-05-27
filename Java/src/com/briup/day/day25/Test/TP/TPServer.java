package com.briup.day.day25.Test.TP;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TPServer {

    public static void main(String[] args) {

        int port = 8888;
        String encoding = "UTF-8";

        ServerSocket server = null;
        Socket socket = null;
        BufferedInputStream in = null;
        BufferedOutputStream out = null;
        PrintWriter out1 = null;

        try {

            server = new ServerSocket(port);
            socket = server.accept();

            in = new BufferedInputStream(socket.getInputStream());
            out = new BufferedOutputStream(new FileOutputStream("src/com/briup/day/day25/Test/TP/美女.png"));

            byte[] bytes = new byte[1024];
            int len = -1;

            while ((len = in.read(bytes)) != -1) {
                out.write(bytes, 0, len);
                out.flush();
            }

            out1 = new PrintWriter(new OutputStreamWriter(socket.getOutputStream(), encoding));
            out1.println("上传成功");
            out1.flush();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (out1 != null) {
                    out1.close();
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
                if (server != null) {
                    server.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

}
