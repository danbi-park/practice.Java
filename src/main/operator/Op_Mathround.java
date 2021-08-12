package main.operator;

import java.util.Scanner;

//java에서 반올림
//전체개수와 바구니를 예제로

public class Op_Mathround {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("소수를 입력하세요 : ");
        double input = scan.nextDouble();
        System.out.print("반올림 할 자리를 입력하세요 : ");
        int digit = scan.nextInt();

        //예를 들어 12.345f를 소수 2번째 자리에서 반올림 하라고 한다면
        double tmp = input * Math.pow(10, digit);
        System.out.println(tmp);
        tmp = Math.round(tmp);
        tmp /= Math.pow(10, digit);
        System.out.printf("최종 출력값 : %10.5f %n", tmp) ;
        MyMath.digitRound(input, digit);
    }
}


//class MyMath {
//    public static void digitRound(double d, int digit) {
//        double tmp = d * Math.pow(10, digit);
//        tmp = Math.round(tmp) / Math.pow(10, digit);
//
//        System.out.printf("최종 출력값 : %10.5f", tmp);
//
//    }
//}
