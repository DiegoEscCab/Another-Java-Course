import java.util.Scanner;

public class DecisionMakingWithIfInJava {

        public static void main(String[] args){
            System.out.println("Pick a number between 1 and 10");
            Scanner input = new Scanner(System.in);
            int inputtedNumber = input.nextInt();

            if (inputtedNumber < 5) {
                System.out.println("Your day gonna be sunny");
            } else {
                System.out.println("Your day gonna be rainy");
            }
        }
}
