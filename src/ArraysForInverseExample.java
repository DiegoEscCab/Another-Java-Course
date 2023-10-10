import java.util.Arrays;

public class ArraysForInverseExample {
    public static void main(String[] args) {

        String[] productos = {
                "Kingston USB 64GB",
                "Celular Pocophone F2 Pro",
                "Laptop HP",
                "Earbuds Samsung",
                "Chromecast 1080p",
                "Bicicleta Trek 29'",
                "Cartera Treewood"
        };
        int totalProductos = productos.length;

//        productos[0] = "Kingston USB 64GB";
//        productos[1] = "Celular Pocophone F2 Pro";
//        productos[2] = "Laptop HP";
//        productos[3] = "Earbuds Samsung";
//        productos[4] = "Chromecast 1080p";
//        productos[5] = "Bicicleta Trek 29'";
//        productos[6] = "Cartera Treewood";

        Arrays.sort(productos);
        System.out.println(" === Usando for === ");
        for (int i = 0; i < totalProductos; i++) {
            System.out.println("Para indice " + i + " : " + productos[i]);
        }
        System.out.println(" === Usando for inverso=== ");
        for (int i = 0; i < totalProductos; i++) {
            System.out.println("Para indice " + (totalProductos-1-i) + " : " + productos[totalProductos-1-i]);
        }

        System.out.println(" === Usando for inverso version 2 === ");
        for (int i = totalProductos - 1 ; i >= 0; i--) {
            System.out.println("para i = " + i + " valor " + productos[i]);
        }
    }
}
