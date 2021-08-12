package main.thread;

public class RunnableEx1 {
    public static void main(String[] args) {
        Bomb2 b2 = new Bomb2();
        Thread t = new Thread(b2); //바로 start는 못하고 이렇게 매개변수로 넣어줘야함
        t.start();

        //바로 상속받은 클래스는 아래와 같이 바로 start할 수 있음
        NuclearBomb nuclear = new NuclearBomb();
        nuclear.start();
    }
}

class NuclearBomb extends Thread {}

class Explosion {}

class Bomb2 extends Explosion implements Runnable{  //다른 클래스를 상속 받으면서 쓰레드를 적용할 때
    @Override
    public void run() {

    }
}