package main.operator;

import java.util.Scanner;



public class Op_Math {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("전체 개수를 입력하세요");
        int ea = scan.nextInt();
        System.out.println("담을 바구니의 크기를 입력하세요");
        int basket = scan.nextInt();
       // int basket_num = ea/basket + (ea%basket>0?1:0);
        int basket_num = (int)Math.ceil(ea/(float)basket);

        System.out.printf("전체개수: %d / 바구니수: %d", ea, basket_num);
    }
}
