package main.variable;

import java.util.Scanner;

public class Soncoding {
    public static void main(String[] args) {
        int rand = (int)(Math.random() * 100) + 1;
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        int input = 0;

        System.out.print("1과 100사이의 값을 입력하세요 :");
        do {
            count++;
            input = Integer.parseInt(scanner.nextLine());

            if (rand > input) {
                System.out.println(input + "보다 큽니다.");
            } else if (rand < input) {
                System.out.println(input + "보다 작습니다.");
            } else {
                System.out.println("정답입니다.");
                System.out.printf("시도한 횟수는 %d번입니다.", count);
                break;
            }
        }while(true);
    }
}
