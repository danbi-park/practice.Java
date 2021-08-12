package main.thread;

public class ThreadGroupEx {
    public static void main(String[] args) {
        ThreadGroup tg = new ThreadGroup("group1");
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) { }
            }
        },"t1");

        t1.start();
        System.out.println(tg.activeCount());
    }
}
