package net_PDB;

import javax.swing.*;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Chatting {
    public static void main(String[] args) {
        String id = JOptionPane.showInputDialog("ID를 입력해주세요");
        String ip = JOptionPane.showInputDialog("서버 IP를 입력하세요");
        try {
            Socket socket = new Socket(ip, 7777);
            System.out.println("서버에 접속되었습니다.");
            Sender sender = new Sender(socket, id);
            sender.start();
            Receiver receiver = new Receiver(socket);
            receiver.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static class Sender extends Thread {
        Scanner scan = new Scanner(System.in);
        Socket socket;
        DataOutputStream output;
        String id;


        public Sender(Socket socket, String id) {
            this.socket = socket; this.id = id;
            try {
                output = new DataOutputStream(socket.getOutputStream());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        @Override
        public void run() {
            try {
                if (output != null) output.writeUTF(id);
                while (output != null) {
                    String tmp = JOptionPane.showInputDialog("메세지를 입력하세요 (종료는 q입력)");
                if(tmp.equals("Q")){
                    System.out.println("채팅이 종료됩니다.");
                    System.exit(-1);
                }
                if (tmp != null && tmp.equals("")) {
                        output.writeUTF("[" + id + "]: " + tmp);
                    }
                }
            } catch (IOException e) {}
            System.out.println("종료되었습니다");
        }



    }

    static class Receiver extends Thread {
        Socket socket;
        DataInputStream input;
        Receiver(Socket socket){
            this.socket = socket;
            try {
                input = new DataInputStream(socket.getInputStream());
            }catch(IOException e){
                e.printStackTrace();
            }
        }

        @Override
        public void run() {
            while (input != null) {
                try {
                    System.out.println(input.readUTF());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
