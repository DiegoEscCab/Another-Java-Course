public class StringConcatenacion {
    public static void main(String[] args) {
        String curso = "Programacion Java";
        String alumno = "Diego Escobedo";

        String detalle = curso + " con el alumno " + alumno;
        System.out.println(detalle);

        int numA = 10;
        int numB = 5;

        System.out.println(detalle + (numA + numB));

        System.out.println(numA + numB + detalle);

        String detalle2 = curso.concat(" con ").concat(alumno);
        System.out.println("detalle2 = " + detalle2);
    }
}
