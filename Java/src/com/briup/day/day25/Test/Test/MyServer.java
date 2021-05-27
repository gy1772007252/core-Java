package com.briup.day.day25.Test.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class MyServer {

    private static List<Socket> list = new ArrayList<>();

    public static void main(String[] args) throws Exception {

        ServerSocket serverSocket = new ServerSocket(8888);
        while (true) {
            Socket socket = serverSocket.accept();
            System.out.println("已连接" + socket);
            list.add(socket);
            new ServerThread(socket).start();
        }

    }

    static class ServerThread extends Thread {
        Socket socket;
        BufferedReader in;

        public ServerThread(Socket socket) throws IOException {
            this.socket = socket;
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        }
        @Override
        public void run() {
            String line = null;
            try {
                while ((line = in.readLine()) != null) {
                    for (Socket socket1 : list) {
                        PrintStream ps = new PrintStream(socket1.getOutputStream());
                        ps.println(line);
                        ps.flush();
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
