import java.util.Scanner;

public class OperadoresLogicos {
    public static void main(String[] args) {

        String username = "Diego";
        String passowrd = "654321";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el username");
        String u = scanner.next();

        System.out.println("Ingrese el password");
        String p = scanner.next();

        boolean autentificacion = false;
        if (username.equals(u) && passowrd.equals(p)) {
            autentificacion = true;
        } else {
            System.out.println("Username or contrasena incorrecto");
        }

        if (autentificacion){
            System.out.println("Bienvenido usuario ".concat(u).concat("!"));
        } else {
            System.out.println("Lo siento, requiere autentificacion");
        }
    }

}
