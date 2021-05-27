package com.briup.day.day25.day25.TCPServer;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

    public static void main(String[] args) {

        int port = 8888;
        String encoding = "UTF-8";

        ServerSocket server = null;
        Socket socket = null;
        BufferedReader in = null;
        PrintWriter out = null;

        try {

            server = new ServerSocket(port);
            System.out.println("服务器已启动");

            while (true) {
                socket = server.accept();
                System.out.println("服务器已接受连接" + socket);

                in = new BufferedReader(new InputStreamReader(socket.getInputStream(), encoding));
                out = new PrintWriter(new OutputStreamWriter(socket.getOutputStream(), encoding));

                out.println("欢迎访问服务器");
                out.flush();

                System.out.println("客户端：" + in.readLine());
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
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
