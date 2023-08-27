public class PrimitivesBoolean {
    public static void main(String[] args) {

        boolean datoLogico = Boolean.FALSE;
        System.out.println("datoLogico = " + datoLogico);

        double d = 98765.43e-3; // 98.76543;
        float f =  12345e2f; // 123.45

        datoLogico =  d < f;
        System.out.println("datoLogico es = " + datoLogico);

        boolean esIgual = 3-2 == 1;
        System.out.println("esIgual es = " + esIgual);
    }
}
