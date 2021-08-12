package main.loop_condition;

public class Exercise06 {
    public static void main(String[] args) {
        for (int i = 1; i < 6; i++) {
            for (int j = 1; j < 6; j++) {
                if (i+j == 6) System.out.printf("%d+%d=%d %n",i,j,i+j);
            }
        }
    }
}
