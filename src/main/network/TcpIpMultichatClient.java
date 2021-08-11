package main.network;

import javax.swing.*;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class TcpIpMultichatClient {
    public static void main(String[] args) {
        String nickName = JOptionPane.showInputDialog("채팅할 대화명을 입력하세요. :)");
        String ip = JOptionPane.showInputDialog("서버 IP를 입력하세요.");
        try {
            Socket socket = new Socket(ip,7777);
            System.out.println("서버에 접속되었습니다.");
            //1.main.thread 돌리기 쉬워요 :>
            //2.sender와 receiver 두줄만 적어주면 돼요
            Sender sender = new Sender(socket,nickName); //6.매개변수로 socket과 nickname을 넣어주면 생성자에서 초기화됨
            sender.start();
            Receiver receiver = new Receiver(socket);
            receiver.start();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    //3.
    //main에 static붙어서 sender를 쓰려면 static을 붙여줘야한다.
    //thread클래스를 상속받아야 함
    //Thread에서 run메서드를 재정의 해줘야 함
    static class Sender extends Thread{
        Socket socket;  //네트워크를 사용하기 위한 통로

        DataOutputStream output; //4.출력 스트림(socket으로 부터 획득 그래야 해당 네트워크로 보낼 수 있음)
        String nickName; //통신할 때 구분되는 id같은 개념

//5.위의 변수들을 아래 생성자로 초기화 시켜 Thread로 보냄
        public Sender(Socket socket, String nickName){
            this.socket = socket;
            this.nickName = nickName;
            try {
                //소켓으로부터 출력스트림을 획득
                output = new DataOutputStream(socket.getOutputStream());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        @Override
        public void run() {
            try {
                if(output != null) output.writeUTF(nickName);
                while (output != null) {
                output.writeUTF("["+nickName+"]"
                        + JOptionPane.showInputDialog("메시지를 입력하세요")); //한글로 보낼 때 깨지지말라고 utf
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    static class Receiver extends Thread{
        Socket socket;
        DataInputStream input;
        //생성자
        Receiver(Socket socket){
            this.socket = socket;
            try {
                input = new DataInputStream(socket.getInputStream()); //socket으로부터 input받음
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        @Override
        public void run() {
            while (input != null) { //객체가 입력받아야지만 돌아감
                try {
                    System.out.println( input.readUTF());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }


}
