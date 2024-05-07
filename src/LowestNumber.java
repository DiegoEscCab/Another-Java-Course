import java.util.Scanner;
public class LowestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int number;

        for (int i = 0; i < 10; i++) {
            number = scanner.nextInt();
            if (number < 10){
                System.out.println("The number is lower than 10");
            } else {
                min = (number < min) ? number : min;
                System.out.println(number);
            }
        }
        System.out.println("The lowest number is: "+ min);
    }
}
