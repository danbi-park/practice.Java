package date.Exercise;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex01 {
    public static void main(String[] args) {

        Calendar cal = Calendar.getInstance();

        cal.set(2020,0,1); //call의 날짜를 2020년 1월 1일로 설정

        for (int i = 0; i < 12; i++) {
            int weekday = cal.get(Calendar.DAY_OF_WEEK); //1일의 요일 구하기

            //1일이 일요일잉ㄴ 경우에는 두번째 일요일은 8이고 아니면 16에서 그 요일을 빼면 됨
            int secondSunday = (weekday == 1)? 8 : 16-weekday;

            //두 번째 일요일로 cal의 날짜(DAY_OF_MONTH)를 바꾼다.
            cal.set(Calendar.DAY_OF_MONTH,secondSunday);

            Date d = cal.getTime(); //Calendar를 Date로 변환한다.
            System.out.println(new SimpleDateFormat("yyyy-MM-dd은 F번째 E요일입니다.").format(d));

            cal.add(Calendar.MONTH,1);
            cal.set(Calendar.DAY_OF_MONTH,1);

        }


    }
}
