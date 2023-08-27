public class PrimitiveCaracteres {
    public static void main(String[] args) {
        char character = '@';
        char decimal = 64;
        System.out.println("character = " + character);
        System.out.println("decimal = " +decimal );
        System.out.println("decimal and character : " + (decimal == character));

        char simbolo = '@';
        System.out.println("simbolo = " + simbolo );
        System.out.println("simbolo and character : " + (simbolo == character));

        char espacio = '\u0020';
        char retroceso = '\b';
        char tabulador = '\t';
        char nuevaLinea = '\n';
        char retornoCarro = '\r';

        System.out.println("char corresponde en byte = " + retroceso + Character.BYTES);
        System.out.println("char corresponde en bites a " + Character.SIZE);
        System.out.println("Valor maximo de un Character " + Character.MAX_VALUE);
        System.out.println("Valor minimo de un Character " + Character.MIN_VALUE);
    }
}
