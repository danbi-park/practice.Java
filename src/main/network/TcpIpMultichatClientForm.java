package network;

import swing.BasicFrm;

import javax.swing.*;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

public class TcpIpMultichatClientForm extends BasicFrm {
    JTextArea ta;
    JScrollPane scp;
    JTextField tf;

    public TcpIpMultichatClientForm() {
        super(300, 600, "채팅창");
    }

    @Override
    public void init() {
        ta = new JTextArea();
        scp = new JScrollPane(ta);
        tf = new JTextField();
    }

    @Override
    public void arrange() {
        add(scp, "Center");
        add(tf, "South");
    }

    public static void main(String[] args) {
        String nickName = JOptionPane.showInputDialog("채팅할 대화명을 입력하세요!");
        String ip = JOptionPane.showInputDialog("서버 IP를 입력하세요!");
        try {
            Socket socket = new Socket(ip, 7777);
            System.out.println("서버에 접속되었습니다.");
            TcpIpMultichatClientForm tcp = new TcpIpMultichatClientForm();
            //Sender sender = new Sender(socket, nickName);
            //sender.start();
            Receiver receiver = tcp.new Receiver(socket);
            receiver.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    class Receiver extends Thread {
        Socket socket;
        DataInputStream in;
        Receiver(Socket socket){
            this.socket = socket;
            try {in = new DataInputStream(socket.getInputStream());}catch(IOException e){}
        }

        @Override
        public void run() {
            while (in != null) {
                try {
                    ta.append(in.readUTF()+"\n");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}