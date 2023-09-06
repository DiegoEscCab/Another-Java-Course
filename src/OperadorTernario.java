import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {

        String variable = 7 == 5 ? "Si es verdadero" : "Es falso";
        System.out.println("variable = " + variable);

        String estado = "";
        double promedio = 5.2;

        double matematicas = 0.0;
        double ciencias = 0.0;
        double historia = 0.0;

        Scanner scanner = new Scanner(System.in);
        matematicas = scanner.nextDouble();
        ciencias = scanner.nextDouble();
        historia = scanner.nextDouble();

        promedio = (matematicas + ciencias + historia) / 3;

        System.out.println(promedio);
        estado = promedio >= 6.00 ? "Aprobado" : "Reprobado";
        System.out.println("estado = " + estado);
    }
}
