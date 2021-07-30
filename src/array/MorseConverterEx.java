package array;

import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;

public class MorseConverterEx {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = "";
        String[] morse =
        {".-", "-...", "-.-.","-..", "."
                ,"..-.", "--.", "....","..",".---"
                , "-.-", ".-..", "--", "-.", "---"
                , ".--.", "--.-",".-.","...","-"
                , "..-", "...-", ".--", "-..-","-.--"
                , "--.." }; //26가지

        do {
            System.out.println("\"Q\"를 입력하면 종료됩니다.");
            System.out.print("입력: ");
            input = scan.nextLine().toUpperCase();

            String tmp = "";

            for (int i = 0; i < input.length(); i++) {
                tmp += morse[input.charAt(i)-65];   //65 또는 'A'로 넣어도 됨 첫문자 A를 빼서 그 문자의 인덱스를 구하는 것
//                                        morse에 배열에 있는 곳으로 감  tmp += morse['S'-'A'];
            }
            System.out.println(tmp);
        } while (!input.contentEquals("Q"));
    }
}
