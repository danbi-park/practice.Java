package loop_condition;

import javax.swing.*;

public class Exercise09 {
    public static void main(String[] args) {
        //문자열로 변환하여 처리
        int input = Integer.parseInt(JOptionPane.showInputDialog(
                "합하고자 하는 숫자를 입력하시요"));
        int sum = 0;
        while(input >0){
            sum += input%10;
            input /= 10;
            System.out.println(input);
        }


        System.out.println();




        System.out.println("total: " + sum);
    }
}

