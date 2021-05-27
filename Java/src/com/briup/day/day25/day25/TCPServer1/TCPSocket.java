package com.briup.day.day25.day25.TCPServer1;

import java.io.*;
import java.net.Socket;

public class TCPSocket {

    public static void main(String[] args) {

        int port = 8888;
        String encoding = "UTF-8";
        String host = "127.0.0.1";

        Socket socket = null;
        BufferedReader in = null;
        BufferedReader inFormConsole = null;
        PrintWriter out = null;

        try {

            socket = new Socket(host, port);
            System.out.println("客户端已连接");

            in = new BufferedReader(new InputStreamReader(socket.getInputStream(), encoding));
            out = new PrintWriter(new OutputStreamWriter(socket.getOutputStream(), encoding));
            inFormConsole = new BufferedReader(new InputStreamReader(System.in, encoding));

            System.out.println("服务器：" + in.readLine());

            out.println(inFormConsole.readLine());
            out.flush();

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

}
