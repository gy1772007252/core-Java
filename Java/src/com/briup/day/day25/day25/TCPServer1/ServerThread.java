package com.briup.day.day25.day25.TCPServer1;

import java.io.*;
import java.net.Socket;

public class ServerThread extends Thread {

    private String encoding = "UTF-8";

    private Socket socket = null;
    private BufferedReader in = null;
    private PrintWriter out = null;

    public ServerThread() {}
    public ServerThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {

        try {

            System.out.println("服务器已接受连接" + socket);

            in = new BufferedReader(new InputStreamReader(socket.getInputStream(), encoding));
            out = new PrintWriter(new OutputStreamWriter(socket.getOutputStream(), encoding));

            out.println("欢迎访问服务器");
            out.flush();

            System.out.println("客户端：" + in.readLine());

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
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

}
