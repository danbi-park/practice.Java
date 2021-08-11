package main.thread;

public class DaemonThreadEx implements Runnable{
    static boolean autoSave = false; //main이랑 run에서도 쓰이게 전역변수로 선언함

    public static void main(String[] args) {
        Thread t = new Thread(new DaemonThreadEx());
        t.setDaemon(true); //해당프로세스가 종료되기 전까지 죽지 않음 false로 한다면 main메서드에서 죽지않음!
        t.start();
        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(1000); //1초간격으로
            } catch (InterruptedException e) {}
            System.out.println(i);
            if(i == 5) autoSave = true;
        }
    }

    @Override
    public void run() {
        while(true){
            try {
                Thread.sleep(3*1000); //3초
            } catch (InterruptedException e) {}
            if(autoSave) autoSave(); //하나는 메서드
        }
    }
    public void autoSave(){
        System.out.println("작업이 저장되었습니다."); //메서드 하나 만들어줌
    }
}
