package com.briup.day.day25.Test.Chat;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;

public class ChatClient extends Frame {

    TextField tfTxt = new TextField();
    TextArea taContent = new TextArea();
    Thread tRecv = new Thread(new RecvThread());

    Socket s = null;
    DataOutputStream dos = null;
    DataInputStream dis = null;

    public static void main(String[] args) {
        new ChatClient().launchFrame();
    }

    public void launchFrame() {
        setLocation(400, 300);
        this.setSize(300, 300);
        add(tfTxt, BorderLayout.SOUTH);
        add(taContent, BorderLayout.NORTH);
        pack();
        this.addWindowListener(new WindowAdapter() {

            public void windowClosing(WindowEvent e) {
                try {
                    dos.close();
                    dis.close();
                    s.close();
                } catch (IOException ae) {
                    ae.printStackTrace();
                }
                System.exit(0);
            }

        });
        tfTxt.addActionListener(new TFListener());
        setVisible(true);

        connect();
        tRecv.start();
    }

    public void connect() {
        try {
            s = new Socket("127.0.0.1", 8888);
            dos = new DataOutputStream(s.getOutputStream());
            dis = new DataInputStream(s.getInputStream());
            System.out.println("connected!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private class TFListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            String str = tfTxt.getText().trim();
            //taContent.setText(str);
            tfTxt.setText("");
            try {
                dos.writeUTF(str);
                dos.flush();
            } catch (IOException e1) {
                e1.printStackTrace();
            }

        }

    }

    private class RecvThread implements Runnable {

        public void run() {
            try {
                while(true) {
                    String str = dis.readUTF();
//System.out.print(str);
                    taContent.setText(taContent.getText() + str + "\n");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

}
