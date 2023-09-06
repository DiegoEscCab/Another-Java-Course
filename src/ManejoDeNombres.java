import java.util.Scanner;
//        La tarea consiste en crear una clase llamada ProgramaManejoDeNombres de la siguiente manera:
//        Se requiere desarrollar un programa que reciba los nombres de 3 integrantes de tu familia o amigos como argumentos de línea de comandos.
//        Se pide por cada nombre de la persona una nueva variable del tipo String al tomar el segundo carácter, pero convertido en mayúscula
//        y se le concatena un punto y los dos últimos caracteres de la persona.
//        Por ejemplo para Andres debe quedar como N.es
//        Debe imprimir como resultado los tres nuevos nombres separado con guion bajo (como una única variable).
//        Ejemplo, un resultado final esperado para los nombres Andres, Maria y Pepe podría ser:
//        N.es_A.ia_E.pe
public class ManejoDeNombres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name1 = scanner.next();
        String name2 = scanner.next();
        String name3 = scanner.next();
        //"First Name 1"
        String firstL1 = name1.toUpperCase().substring(1,2);
        String lastL1 = name1.substring(name1.length() -2);
        String result1 = firstL1.concat(".").concat(lastL1);
        //"Second Name 2"
        String firstL2 = name2.toUpperCase().substring(1,2);
        String lastL2 = name2.substring(name2.length() -2);
        String result2 = firstL2.concat(".").concat(lastL2);
        //"Third Name 3"
        String firstL3 = name3.toUpperCase().substring(1,2);
        String lastL3 = name3.substring(name3.length() -2);
        String result3 =firstL3.concat(".").concat(lastL3);

        System.out.println(result1.concat("_").concat(result2).concat("_").concat(result3));
    }
}
