package main.date;

import java.util.Calendar;
import java.util.Date;

public class DateEx01 {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        int year = date.getYear();
        System.out.println(year);

        //new말고 자신이 가지고 있는 메서드를 가지고 인스턴스를 생성 -> 인스턴스를 중복으로 만들지 않기 위해서 (Singleton)
        Calendar cal = Calendar.getInstance();
        System.out.println(cal.get(Calendar.YEAR));
        System.out.println(cal.get(Calendar.MONTH)+1);
        System.out.println(cal.get(Calendar.DATE));
        System.out.println(cal.get(Calendar.DAY_OF_MONTH)); //달의 일 DATE와 똑같음
        System.out.println(cal.get(Calendar.DAY_OF_WEEK_IN_MONTH)); //몇번째 요일이냐
        //요일은 1부터 7까지 -> 1:일요일
        System.out.println(MyDate.getWeek(cal.get(Calendar.DAY_OF_WEEK)));

        System.out.println(MyDate.getAmPm(cal.get(Calendar.AM_PM)));

        System.out.println(cal.get(Calendar.HOUR));
        System.out.println(cal.get(Calendar.MINUTE));
        System.out.println(cal.get(Calendar.SECOND));
        System.out.println(MyDate.getTime());
        System.out.println(MyDate.getFulltime());
    }

}
