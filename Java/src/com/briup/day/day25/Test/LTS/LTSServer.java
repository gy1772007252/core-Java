package com.briup.day.day25.Test.LTS;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class LTSServer {

    public static List<ServerThread> tList = new ArrayList<>();

    public static void main(String[] args) {

        new LTSServer().start();

    }

    private void start() {
        int port = 8887;

        ServerSocket server = null;
        Socket socket = null;

        try {

            server = new ServerSocket(port);
            System.out.println("服务器已启动");

            while (true) {
                socket = server.accept();
                ServerThread st = new ServerThread(socket);
                st.start();
                tList.add(st);
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

    class ServerThread extends Thread {

        private String encoding = "UTF-8";

        private Socket socket = null;
        private BufferedReader in = null;
        private PrintWriter out = null;

        public ServerThread() {}
        public ServerThread(Socket socket) throws IOException {
            this.socket = socket;
            in = new BufferedReader(new InputStreamReader(this.socket.getInputStream(), encoding));
            out = new PrintWriter(new OutputStreamWriter(this.socket.getOutputStream(), encoding));
        }

        @Override
        public void run() {

            try {

                System.out.println("服务器已接受连接" + socket);
                out.println("欢迎访问服务器");
                out.flush();

                while (true) {
                    String line = in.readLine();
                    if (line.equals("exit")) {
                        break;
                    }
                    System.out.println(line);
                    for (int i = 0; i < LTSServer.tList.size(); i++) {
                        LTSServer.tList.get(i).out.println(line);
                        LTSServer.tList.get(i).out.flush();
                    }
                }

            } catch (IOException e) {
                System.out.println(e);
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
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }

    }

}
