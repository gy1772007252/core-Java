package com.briup.day.day25.Test.LTS;

import java.io.*;
import java.net.Socket;

public class LTSSocket {

    Socket socket = null;
    BufferedReader in = null;
    BufferedReader inFormConsole = null;
    PrintWriter out = null;
    SocketThread socketThread = new SocketThread();

    public static void main(String[] args) {

        new LTSSocket().start();

    }

    private void start() {
        int port = 8887;
        String encoding = "UTF-8";
        String host = "127.0.0.1";

        try {

            socket = new Socket(host, port);
            System.out.println("已连接");

            in = new BufferedReader(new InputStreamReader(socket.getInputStream(), encoding));
            out = new PrintWriter(new OutputStreamWriter(socket.getOutputStream(), encoding));
            inFormConsole = new BufferedReader(new InputStreamReader(System.in, encoding));

            System.out.println(in.readLine());

            socketThread.start();

            while (true) {
                String line = inFormConsole.readLine();
                out.println(line);
                out.flush();
                if (line.equals("exit")) {
                    break;
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (out != null) {
                    out.close();
                }
                if (inFormConsole != null) {
                    inFormConsole.close();
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

    class SocketThread extends Thread {
        @Override
        public void run() {
            try {
                while (true) {
                    System.out.println("公屏：" + in.readLine());
                }
            } catch (IOException e) {
                System.out.println("已退出");
            } finally {
                try {
                    if (in != null) {
                        in.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
