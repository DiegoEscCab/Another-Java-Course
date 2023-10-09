import java.text.SimpleDateFormat;
import java.util.Date;

public class JavaUtilDate {
    public static void main(String[] args) {

        Date fecha = new Date();

        System.out.println(fecha);

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMMM-yyyy");
        String fechaFormat = dateFormat.format(fecha);

        long j = 0;
        for (int i = 0; i < 100000000; i++) {
            j += i;
        }
        System.out.println("j = " + j);

        Date fecha2 = new Date();
        long tiempoFinal = fecha2.getTime() - fecha.getTime();
        System.out.println("Tiempo transcurrido en el for = " + tiempoFinal);
        System.out.println("fechaFormat = " + fechaFormat);

    }
}
