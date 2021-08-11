package main.date;

import java.util.Calendar;
import java.util.Date;

public class DateCalendarCovertEx {
    public static void main(String[] args) {
        Date d = new Date();
        Calendar cal = Calendar.getInstance();
        //Date => Calendar
        cal.setTime(d);

        //Calendar => Date
        Date date = new Date(cal.getTimeInMillis());
    }
}
