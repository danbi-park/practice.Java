package date;

import java.util.Calendar;

public class MyDate {
    public static String getDate(){
        Calendar cal = Calendar.getInstance();
        return
                cal.get(Calendar.YEAR)+"-"+twoDigit(cal.get(Calendar.MONTH)+1)
                +"-"+twoDigit(cal.get(Calendar.DATE));

    }

    //overriding //return타입이 같고 다 같으면 overloading
    public static String getDate(Calendar cal){
        return
                cal.get(Calendar.YEAR)+"-"+twoDigit(cal.get(Calendar.MONTH)+1)
                +"-"+twoDigit(cal.get(Calendar.DATE));

    }



    public static String twoDigit(int num){
        return num<10?"0"+num:num+"";//어차피 문자열로 돌려줘야해서
    }

    public static String getWeek(int week) {
        String[] arr = {"일요일","월요일","화요일","수요일","목요일","금요일","토요일"};
        //0부터 6까지 출력해야 하기 때문에 []는 길이값이라서 1을 하나 빼줘야 정확히 들어감
        return arr[week-1];
        }

    public static String getAmPm(int ampm){
        return ampm>0?"오후":"오전";

        //선생님 풀이
        //return new String[]{"오전","오후"}[ampm];

//        String[] tmp = {"AM","pm"};
//        return tmp[ampm];
    }

//    public static void getTime(){
//        System.out.println(Calendar.HOUR + "시" + Calendar.MINUTE + "분" + Calendar.SECOND + "초" );
//    }

    public static String getTime(){
        Calendar cal = Calendar.getInstance();
        return cal.get(Calendar.HOUR_OF_DAY)+":"
                +twoDigit(cal.get(Calendar.MINUTE)) +":"
                +twoDigit(cal.get(Calendar.SECOND));
    }

    public static String getFulltime(){
        return getDate() + " " + getAmPm(Calendar.getInstance().get(Calendar.AM_PM)) + getTime();

    }

}
