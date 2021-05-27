package com.briup.day.day25.day25.TCPServer1;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

    public static void main(String[] args) {

        int port = 8888;

        ServerSocket server = null;
        Socket socket = null;

        try {

            server = new ServerSocket(port);
            System.out.println("服务器已启动");

            while (true) {
                socket = server.accept();
                new ServerThread(socket).start();

            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
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
