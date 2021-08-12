package main.thread;

public class SuspendResumeStopEx {
    public static void main(String[] args) {
        RunImpl r = new RunImpl();
        Thread t1 = new Thread(r, "*");
        Thread t2 = new Thread(r, "**");
        Thread t3 = new Thread(r, "***");
        t1.start();t2.start();t3.start();
        try {
            Thread.sleep(2000); //main메서드에 있는 thread임
            t1.suspend();
            Thread.sleep(2000);
            t2.suspend();
            Thread.sleep(3000);
            t1.resume();
            Thread.sleep(3000);
            t1.stop(); t2.stop();
            Thread.sleep(2000);
            t3.stop();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


class RunImpl implements Runnable{

    @Override
    public void run() {
        while(true){
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}