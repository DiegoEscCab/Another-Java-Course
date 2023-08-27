public class ConversionDeTipos {
    public static void main(String[] args) {
        //Conversion de cadenas a primitivos
        String numeroStr = "50";
        
        int numeroInt = Integer.parseInt(numeroStr);
        System.out.println("numeroInt = " + numeroInt);

        String realStr = "98765.43e-3";
        double realDouble = Double.parseDouble(realStr);
        System.out.println("realDouble = " + realDouble);
        
        String logicoStr = "true";
        boolean realBoolean = Boolean.parseBoolean(logicoStr);
        System.out.println("realBoolean = " + realBoolean);

        //Conversion de primitivos a cadenas
        int intNumber = 100;
        String strNumer = Integer.toString(intNumber);
        System.out.println("strNumer = " + strNumer);
        
        strNumer = String.valueOf(intNumber);
        System.out.println("strNumer = " + strNumer);

        double doubleReal = 1.23456e2;
        String strDoubleReal = Double.toString(doubleReal);
        System.out.println("strDoubleReal = " + strDoubleReal);

        strDoubleReal = String.valueOf(1.23456e2f);
        System.out.println("strDoubleReal = " + strDoubleReal);
    }
}
