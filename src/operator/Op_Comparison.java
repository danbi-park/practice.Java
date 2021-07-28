package operator;

import java.util.Scanner;

//문자열 비교 equals
//ID & pass를 이용해서

public class Op_Comparison {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("ID : ");
        String id = scan.nextLine();

        System.out.print("Password : ");
        String pass = scan.nextLine();

        // id = root, pass = 1234라고 가정
        //if (id.equalsIgnoreCase("root")) {
        if (id.equals("root")) {
            if (pass.equals("1234")) {
                System.out.println("로그인 되었습니다.");
            } else {
                System.out.println("비밀번호가 다릅니다.");
            }
        }else {
            System.out.println("아이디가 다릅니다.");
        }
    }
}
