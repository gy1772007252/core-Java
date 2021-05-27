package com.briup.day.day25.day25.UDPServer;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Date;

public class UDPSocket {

    public static void main(String[] args) {

        String ip = "127.0.0.1";
        int port = 8888;

        DatagramSocket socket = null;
        DatagramPacket packet = null;

        try {
            byte[] bytes = "hello world 中国".getBytes();

            socket = new DatagramSocket();
            packet = new DatagramPacket(bytes, 0, bytes.length, InetAddress.getByName(ip), port);

            socket.send(packet);
            System.out.println("客户端发送数据完毕");

            byte[] bytes1 = new Date().toString().getBytes();
            DatagramPacket packet1 = new DatagramPacket(bytes1, bytes1.length);
            socket.receive(packet1);
            System.out.println("客户端接收到数据：" + new String(bytes, 0, packet.getLength()));

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (socket != null) {
                socket.close();
            }
        }

    }

}
