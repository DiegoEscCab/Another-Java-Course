import java.util.Arrays;

public class EjemploArraysFor {
    public static void main(String[] args) {

        String[] productos = new String[7];
        int totalProductos = productos.length;

        productos[0] = "Kingston USB 64GB";
        productos[1] = "Celular Pocophone F2 Pro";
        productos[2] = "Laptop HP";
        productos[3] = "Earbuds Samsung";
        productos[4] = "Chromecast 1080p";
        productos[5] = "Bicicleta Trek 29'";
        productos[6] = "Cartera Treewood";

        Arrays.sort(productos);
        System.out.println(" === Usando for === ");
        for (int i = 0; i < totalProductos; i++) {
            System.out.println("Para indice " + i + " : " + productos[i]);
        }
        System.out.println(" === Usando forEach === ");
        for (String prod: productos) {
            System.out.println("prod = " + prod);
        }

        System.out.println(" === Usando while === ");
        int i = 0;
        while (i < totalProductos) {
            System.out.println("Para indice " + i + " : " + productos[i]);
            i++;
        }

        System.out.println(" === Usando do while === ");
        int j = 0;
        do {
            System.out.println("Para indice " + j + " : " + productos[j]);
            j++;
        }
        while (j < totalProductos);

        int[] numeros = new int[10];
        int totalNumeros = numeros.length;
        for (int k = 0; k < totalNumeros; k++) {
            numeros[k] = k*3;
        }

        for (int k = 0; k < totalNumeros; k++) {
            System.out.println("numeros = " + numeros[k]);
        }

    }
}
