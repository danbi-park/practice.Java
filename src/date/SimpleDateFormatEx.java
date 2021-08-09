package date;


import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatEx {
    public static void main(String[] args) {
        //SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss a"); //2021-08-09 14:06:08 오후
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH:mm:ss a"); //2021년 08월 09일 14:06:39 오후
        System.out.println(sdf.format(new Date()));
    }
}
