package date;

import java.util.Calendar;

public class CalendarSetEx {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        //1월할라면 0넣고 2월넣을라면 1을 넣어줘야함
        cal.set(2021,1,1);
        System.out.println(cal.getActualMaximum(Calendar.DATE));

        Calendar cal2 = Calendar.getInstance();
        cal2.set(2021,7,9); //8월 9일임
        long diff = cal2.getTimeInMillis() - cal.getTimeInMillis(); //2월 1일부터 현재 까지
        System.out.println(diff/1000 + "초가 지났습니다");//초
        System.out.println(diff/(1000*60) + "분이 지났습니다");//분
        System.out.println(diff/(1000*60*60) + "시간이 지났습니다");//시간
        System.out.println(diff/(1000*60*60*24) + "일이 지났습니다");//일수 189일이 지남

        cal2.add(Calendar.DATE, 5);
        System.out.println(MyDate.getDate(cal2));
    }
}
