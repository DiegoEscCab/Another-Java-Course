import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class JavaUtilDateParse {
    public static void main(String[] args) {

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        try {
            Date date = format.parse("2023-03-06");
            System.out.println("date = " + date);
            System.out.println("format = " + format.format(date));


            Date date2 = new Date();
            if (date.after(date2)){
                System.out.println("Date from the user is after the Date2");
            } else if (date.before(date2)) {
                System.out.println("Date is before Date2");
            } else if (date.equals(date2)) {
                System.out.println("Date and Date are equals");
            }
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

    }
}
