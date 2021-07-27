package variable;

import java.util.Scanner;

public class ScanEx {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //입력 장치 out은 출력장치
        int rand = (int) (Math.random() * 100) + 1; // int로 바꾸는데 0부터99까지 나옴
        System.out.println("숫자를 맞춰 봐라(1~100)");

        while (true) {
       // int answer = scan.nextInt();
            int answer;
        try {
            answer = Integer.parseInt(scan.nextLine());
        } catch (Exception e){
            System.out.println("숫자를 입력해주세요");
            continue;
        }
            if (answer > rand){
                System.out.println("큽니다");
            } else if (answer < rand) {
                System.out.println("작습니다");
            } else {
                System.out.println("정답입니다.");
                break;
            }
        }
    }
}
