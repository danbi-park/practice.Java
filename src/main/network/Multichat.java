package main.network;

import javax.swing.*;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Multichat {
    public static void main(String[] args) {
        String nickName = JOptionPane.showInputDialog("채팅할 이름을 입력해주세요");
        String ip = JOptionPane.showInputDialog("채팅창 주소를 입력하세요");

        try {
            Socket socket = new Socket(ip, 7777);
            System.out.println("서버에 접속되었습니다.");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    static class Sender extends Thread{
        String nickName;
        Socket socket;
        DataOutputStream output;



        public Sender(String nickName, Socket socket){
           this.nickName = nickName;
           this.socket = socket;

           try {
               output = new DataOutputStream(socket.getOutputStream());
           } catch (IOException e) {
               e.printStackTrace();
           }
       }

        @Override
        public void run() {
            try {
                if(output != null) output.writeUTF(nickName);
                while (output != null){
                    output.writeUTF("["+nickName+"]"
                            + JOptionPane.showInputDialog("메시지를 입력하세요")); //한글로 보낼 때 깨지지말라고 utf
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }



    }





}
