package main.variable;

public class CharEx {
    char c4 = '\u0000';
    public static void main(String[] args) {
        char c1 = 'A'; //65
        char c2 = 'h'; //48
        char c3 = 'a'; //97
        System.out.print(c1);
        System.out.print(c2);
        CharEx ce = new CharEx();
        System.out.print(new CharEx().c4);
        System.out.println("Take on me");
        System.out.println(Integer.parseInt("123"));
        System.out.println(c1+1);
        //char는 byte 숫자 1은 int 로 4byte로 바껴짐  c1을 int로 바꿈 A가
        // 내부적으로


    }
}
