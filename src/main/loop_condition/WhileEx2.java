package main.loop_condition;

public class WhileEx2 {
    public static void main(String[] args) {
        int sum =0;
        int i = 0;
        while (true) {
            System.out.printf("%d - %d%n",i,sum);
            sum += ++i;
            if(sum >= 100) break;
        }
        System.out.println("sum: " + sum);
    }
}
