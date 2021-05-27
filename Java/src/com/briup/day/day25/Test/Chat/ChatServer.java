package com.briup.day.day25.Test.Chat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class ChatServer {

    ServerSocket ss = null;
    List<Client> clients = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        new ChatServer().start();
    }

    public void start() throws IOException {

        ss = new ServerSocket(8888);
        while(true) {
            Socket s = ss.accept();
            Client c = new Client(s);
            System.out.println("a client connected!");
            new Thread(c).start();
            clients.add(c);
        }

    }

    class Client implements Runnable {

        private Socket s;
        private DataInputStream dis = null;
        private DataOutputStream dos = null;

        public Client(Socket s) {
            this.s = s;
            try {
                dis = new DataInputStream(s.getInputStream());
                dos = new DataOutputStream(s.getOutputStream());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public void run() {
            try {
                while(true) {
                    String str = dis.readUTF();
                    System.out.println(str);
                    for(int i=0; i<clients.size(); i++) {
                        clients.get(i).dos.writeUTF(str);;
                        //clients.remove(this);
                    }
                }
            } catch (Exception e) {
                System.out.print("Client closed!");
            } finally {
                try {
                    if(dis != null) dis.close();
                    if(dos != null) dos.close();
                    if(s != null) s.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

}
