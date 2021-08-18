package network;

import sun.plugin.javascript.JSClassLoader;
import swing.BasicFrm;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class TcpIpMultichatClient extends BasicFrm{
    private JTextArea ta;
    private JScrollPane scp;
    private JTextField tf;
    private String nickName;
    private DataOutputStream out;


    public TcpIpMultichatClient() {
        super(500, 600, "Chatting room");
        tf.requestFocus();
    }

    @Override
    public void init() {
        nickName = JOptionPane.showInputDialog("채팅할 대화명을 입력하세요. :)");
        String ip = JOptionPane.showInputDialog("서버 IP를 입력하세요.","192.168.0.127"); //쌤 서버

        ta = new JTextArea();
        ta.setEditable(false); //수정할 수 없도록
        scp = new JScrollPane(ta);
        tf = new JTextField();
        ta.setFont(new Font("맑은고딕",Font.PLAIN,20));
        tf.setFont(new Font("맑은고딕",Font.PLAIN,20));

        try {
            Socket socket = new Socket(ip,7777);
            out = new DataOutputStream(socket.getOutputStream());
            out.writeUTF(nickName);
            Receiver receiver = new Receiver(socket);
            receiver.start();
        } catch (IOException e) {
            e.printStackTrace();
        }

        tf.addActionListener(e -> {
                String msg = tf.getText();
                if(msg == null || msg.equals("")) return;
//                if(msg.equalsIgnoreCase("Q")){
//                    JOptionPane.showMessageDialog(null,"Chatting is terminated");
//                    System.exit(-1);
//                }
                try {
                    out.writeUTF("[" + nickName + "]" + msg);
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
                tf.setText("");
        });
    }

    @Override
    public void arrange() {
        add(scp, "Center");
        add(tf, "South");
    }

    public static void main(String[] args) {
        new TcpIpMultichatClient();
    }


    class Receiver extends Thread{
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
//                    System.out.println( input.readUTF());
                    ta.append(input.readUTF() + "\n");
                    ta.setCaretPosition(ta.getDocument().getLength());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
