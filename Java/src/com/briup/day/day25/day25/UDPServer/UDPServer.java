package com.briup.day.day25.day25.UDPServer;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Date;

public class UDPServer {

    public static void main(String[] args) {

        byte[] bytes = new byte[1024];
        String ip = "127.0.0.1";
        int port = 8888;

        DatagramSocket socket = null;
        DatagramPacket packet = null;

        try {

            socket = new DatagramSocket(port);
            packet = new DatagramPacket(bytes, 0, bytes.length);

            System.out.println("服务器已启动，等待客户端发送数据...");

            socket.receive(packet);

            System.out.println("服务器接收到数据：" + new String(bytes, 0, packet.getLength()));

            byte[] bytes1 = new Date().toString().getBytes();
            DatagramPacket packet1 = new DatagramPacket(bytes, 0, bytes.length, InetAddress.getByName(ip), port);

            socket.send(packet);
            System.out.println("服务器发送数据完毕");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (socket != null) {
                socket.close();
            }
        }

    }

}
