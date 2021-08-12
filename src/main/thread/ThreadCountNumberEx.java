package main.thread;

import javax.swing.*;

public class ThreadCountNumberEx {
    public static void main(String[] args) {
        Bomb b = new Bomb();
        b.start();
        String pickLine = JOptionPane.showInputDialog("빨간선(0), 파란선(1) 중 선택하시오");
        b.pickLine(Integer.parseInt(pickLine));


    }
}

//thread를 상속 받으면 다른 클래스를 상속받지 못함(인터페이스이용해야함)
class Bomb extends Thread{
    boolean stopped = false;
    int realLine = (int) (Math.random() * 2);

    @Override  //mark annotation
    public void run() {
        for (int i = 10; i > 0 ; i--) {
            if(stopped) break;
                System.out.println(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }





    void pickLine(int pickLine){
        if(realLine == pickLine) {
            System.out.println("휴.. 살았당");
        } else {
            System.out.println("💫☢🎇 웁스 XoX");
          }
        stopped = true;
    }
}