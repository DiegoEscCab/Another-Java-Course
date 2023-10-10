import java.util.Arrays;

public class ArraysExample {
    public static void main(String[] args) {

        String[] productos = new String[7];

        productos[0] = "Kingston USB 64GB";
        productos[1] = "Celular Pocophone F2 Pro";
        productos[2] = "Laptop HP";
        productos[3] = "Earbuds Samsung";
        productos[4] = "Chromecast 1080p";
        productos[5] = "Bicicleta Trek 29'";
        productos[6] = "Cartera Treewood";

        Arrays.sort(productos);

        String prod1 = productos[0];
        String prod2 = productos[1];
        String prod3 = productos[2];
        String prod4 = productos[3];
        String prod5 = productos[4];
        String prod6 = productos[5];
        String prod7 = productos[6];

        System.out.println("prod1 = " + prod1);
        System.out.println("prod2 = " + prod2);
        System.out.println("prod3 = " + prod3);
        System.out.println("prod4 = " + prod4);
        System.out.println("prod5 = " + prod5);
        System.out.println("prod6 = " + prod6);
        System.out.println("prod7 = " + prod7);

        int[] numeros = new int[4];

        numeros[0] = 40;
        numeros[1] = Integer.valueOf("6");
        numeros[2] = 20;
        numeros[3] = 80;

        Arrays.sort(numeros);
        int i = numeros[0];
        int j = numeros[1];
        int k = numeros[2];
        int l = numeros[3];

        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
        System.out.println("l = " + l);
    }
}
