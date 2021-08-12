package main.operator;

public class OperatorEx2_overflow {
    public static void main(String[] args) {
        int a = 1_000_000;
        int b = 2_000_000;
        long l = 2_000_000l;
        long c = a * (long)b; //적어도 하나는 long으로 형변환 해줘야함
        long d = a * l;
        System.out.println(c);
        System.out.println(d);
    }
}
