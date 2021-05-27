package com.briup.day.day25.Test.Test;

import java.io.*;
import java.net.Socket;

public class MyClient {

    public static void main(String[] args) throws Exception{

        Socket socket = new Socket("127.0.0.1", 8888);
        ClientThread clientThread = new ClientThread(socket);
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
        String line = null;
        clientThread.start();
        while ((line = in.readLine()) != null) {
            out.println(line);
            out.flush();
        }

    }

    static class ClientThread extends Thread {
        Socket socket;
        BufferedReader in;
        public ClientThread(Socket socket) throws IOException {
            this.socket = socket;
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        }
        @Override
        public void run() {
            try {
                while (true) {
                    System.out.println("公屏：" + in.readLine());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
