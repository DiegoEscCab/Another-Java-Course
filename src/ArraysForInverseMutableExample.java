import java.util.Arrays;

public class ArraysForInverseMutableExample {

    public static void  inverseArray (String[] array){
        int totalProductos = array.length;
        int totalProductos2 = array.length;
        for (int i = 0; i < totalProductos2; i++) {
            String actual = array[i];
            String inverso = array[totalProductos-1-i];
            array[i] = inverso;
            array[totalProductos-1-i] = actual;
            totalProductos2--;
        }
    }
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

        Arrays.sort(productos);
        inverseArray(productos);

        System.out.println(" === Usando for === ");
        for (int i = 0; i < totalProductos; i++) {
            System.out.println("Para indice " + i + " : " + productos[i]);
        }
    }
}
