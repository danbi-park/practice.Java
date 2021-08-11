package main.date;

import java.text.DecimalFormat;

public class FormatEx {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.0"); //0.#으로 하면 0생략
        System.out.println(df.format(1234)); //1234.0 출력
        //패턴에 '.'이 없을 때 0은 개수만큼 가수부분을 표현 0E0 => 1E6
        //패턴에 '.'이 없을 때 #은 개수가 많더라도 일의 자리만 가수부분으로 표현 #E0 => .1E7
    }
}
