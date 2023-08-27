public class PrimitiveFloat {
    public static void main(String[] args) {

        float realFloat = 0.0000000001f;
        System.out.println("realFloat = "+ realFloat);
        System.out.println("float corresponde en byte a " + Float.BYTES);
        System.out.println("float corresponde en bites a " + Float.SIZE);
        System.out.println("Valor maximo de un float " + Float.MAX_VALUE);
        System.out.println("Valor minimo de un float " + Float.MIN_VALUE);

        double realDouble = 3.4028235E38;
        System.out.println("realDouble = "+ realDouble);
        System.out.println("Double corresponde en byte a " + Double.BYTES);
        System.out.println("Double corresponde en bites a " + Double.SIZE);
        System.out.println("Valor maximo de un Double " + Double.MAX_VALUE);
        System.out.println("Valor minimo de un Double " + Double.MIN_VALUE);

        float varFlotante = 3.1416f;
        System.out.println("varFlotante = "+ varFlotante);
    }
}
