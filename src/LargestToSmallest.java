import java.util.Scanner;
public class LargestToSmallest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("First value (a):");
        int a = scan.nextInt();
        System.out.println("Second value (b):");
        int b = scan.nextInt();

        String result = (a > b) ? a + "," + b : b + "," + a;
        System.out.printf("Answer: ");
        System.out.printf(result);
    }
}
