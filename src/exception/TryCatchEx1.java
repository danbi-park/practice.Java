package exception;

public class TryCatchEx1 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println(10/(int)(Math.random()*3)); //10을 0,1,2로 나눔
            } catch (Exception e) {
                System.out.println(0);
            }
        }
    }
}
