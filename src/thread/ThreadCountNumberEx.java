package thread;

import javax.swing.*;

public class ThreadCountNumberEx {
    public static void main(String[] args) {
        Bomb b = new Bomb();
        b.start();
        String pickLine = JOptionPane.showInputDialog("빨간선(0), 파란선(1) 중 선택하시오");

        b.pickLine(Integer.parseInt(pickLine));
    }
}

class Bomb extends Thread{
    int realLine = (int) (Math.random() * 2);

    @Override
    public void run() {
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
            try {Thread.sleep(1000);} catch (InterruptedException e) {}
        }
    }
    void pickLine(int pickLine){
        if(realLine == pickLine) {
            System.out.println("휴.. 살았당");
        } else {
            System.out.println("💫☢🎇 웁스 XoX");
        }
    }
}