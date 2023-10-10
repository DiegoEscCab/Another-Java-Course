import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        double r = s.nextDouble();
        double area = Math.PI*Math.pow(r,2);
        System.out.println("The circle area is = " + area);
    }
}
