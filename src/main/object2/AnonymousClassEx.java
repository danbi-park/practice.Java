package main.object2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnonymousClassEx {
    public static void main(String[] args) {
        //interface를 익명객체화
        JButton btn = new JButton("확인");
        btn.addActionListener(new ActionListener() { //익명객체임
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        //배열에 들어가는 인스턴스를 익명객체로 만들 수 있다.
        JButton[] btns = new JButton[3];
        //배열에 인덱스로만 접근함 이름없음
        btns[1] = new JButton("두 번째 버튼"); //익명객체임
        btns[2] = new JButton("세 번째 버튼");


        JButton btnFirst = new JButton("1st");
        btns[0] = btnFirst; //이름있는 배열에 인스턴스가 생성

        //인스턴스가 객체화 될 때
        Runnable r = new Runnable() {
            @Override
            public void run() {

            }
        };

    }
}
