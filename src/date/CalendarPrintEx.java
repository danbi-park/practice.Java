package date;

import javax.swing.*;
import java.util.Calendar;

//해당 달력출력 무슨 요일부터 출력해야하나 (비어있는 칸) 1일이 무슨 요일인지 중요
public class CalendarPrintEx {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog(
                "출력하고자 하는 년월(yyyy-mm)을 입력하세요\n ex)2021 08");

        //먼저 생각해 볼 것
        //1. 해당 월의 1일이 무슨 요일인지
        //2. 그 달의 마지막 일자

        int year = Integer.parseInt(input.split(" ")[0]);
        int month = Integer.parseInt(input.split(" ")[1]);
        Calendar cal = Calendar.getInstance();

        cal.set(year,month-1,1);
        int firstOfMonthWeek = cal.get(Calendar.DAY_OF_WEEK);
        int lastOfMonth = cal.getActualMaximum(Calendar.DATE);

        //7단위로 줄바꿈 해주기 위한 변수
        int start = 0;

        System.out.printf("  %4d년%2d월 \n", year,month);
        System.out.println(" SUN MON TUE WED THU FRI SAT");
        for (int i = 1; i < firstOfMonthWeek; i++) { //공백띄우기
            System.out.printf("%4s"," ");
            ++start;
        }
        for (int i = 1; i <= lastOfMonth; i++) { //30일까지 출력하기!
            System.out.printf("%4d", i);
            if (++start % 7 == 0) System.out.println(); //7이 되면 줄바꿈 해주기

        }
    }
}
