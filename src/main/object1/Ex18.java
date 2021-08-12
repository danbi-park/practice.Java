package main.object1;

import javax.swing.*;

public class Ex18 {

    static boolean isNumber(String str){
        boolean result = true;
        for (int i = 0; i < str.length(); i++) {
            if (!(str.charAt(i)>='0' && str.charAt(i)<='9')){
            result = false; //문자열
            break;
            }
        }
        return result;
    }


    public static void main(String[] args) {
        String input = "";

            do {
                input = JOptionPane.showInputDialog("숫자 판별 프로그램 입니다.");
                if (input != null && !input.equals("")) {
                    System.out.println(input + "은/는 숫자입니까?");
                    System.out.println(isNumber(input) ? "숫자입니다." : "문자입니다.");
                } else {
                    JOptionPane.showMessageDialog(null, "내용이 비어있습니다.");
                    continue;
                }
            } while (!input.equalsIgnoreCase("Q"));
    }
}
