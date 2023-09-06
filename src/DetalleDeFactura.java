import java.util.Scanner;

public class DetalleDeFactura {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Nombre de la factura");
        String factura = scan.nextLine();

        System.out.println("Ingrese precio del primer articulo");
        Double firstArt = scan.nextDouble();

        System.out.println("Ingrese precio del segundo articulo");
        Double secondArt = scan.nextDouble();

        double beforeTax = (firstArt + secondArt);
        double tax = (firstArt + secondArt)*0.19;
        double total = (firstArt + secondArt) + ((firstArt + secondArt)*0.19);

        System.out.println("La factura a nombre de: " + factura +
                "\ntiene un total antes de impuestos de: " + beforeTax +
                "\ncon un impuesto del 19% equivalente a: " + tax +
                "\nsiendo un monto total después de impuestos a: " + total);
    }
}
