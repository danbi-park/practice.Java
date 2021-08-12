package main.thread;

public class MultiSingleCompareEx {
    static long startTime;
    public static void main(String[] args) {
        startTime  = System.currentTimeMillis();

        VerticalBar verti = new VerticalBar();
        verti.start();

        for (int i = 0; i < 300; i++) {
            System.out.printf("%s", "-");
        }
        long endTime = System.currentTimeMillis();
        System.out.print("걸린시간 : " + (endTime - startTime));

    }
}

class VerticalBar extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 300; i++) {
            System.out.printf("%s", "|");
        }
        System.out.print("걸린시간 : " +
                (System.currentTimeMillis() - MultiSingleCompareEx.startTime));
    }
}
