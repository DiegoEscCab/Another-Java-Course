import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class JavaUtilCalendar {
    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();

        calendar.set(2023,2,06,12,10,05);

        calendar.set(Calendar.YEAR, 2020);
        calendar.set(Calendar.MONTH, 02);
        calendar.set(Calendar.DAY_OF_MONTH, 06);

        calendar.set(Calendar.HOUR_OF_DAY,10);
        calendar.set(Calendar.AM_PM, Calendar.PM);
        calendar.set(Calendar.MINUTE, 30);
        calendar.set(Calendar.SECOND,15);
        calendar.set(Calendar.MILLISECOND,100);

        Date date = calendar.getTime();
        System.out.println("fecha sin formato = " + date);

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS a");
        String dateWithFormat = format.format(date);
        System.out.println("dateWithFormat = " + dateWithFormat);

    }
}
