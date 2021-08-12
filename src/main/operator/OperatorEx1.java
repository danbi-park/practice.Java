package main.operator;

public class OperatorEx1 {
    public static void main(String[] args) {
        int i = 5, j = 0;
        j = i++;
        System.out.printf("j = i++; 실행 후 , i=%d, j=%d %n", i, j);

        i = 5;
        j = 0;
        j = ++i;
        System.out.printf("j = ++i; 실행 후 , i=%d, j=%d %n", i, j);
    }
}
