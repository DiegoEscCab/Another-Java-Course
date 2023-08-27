import java.util.Scanner;

public class ConcatenatingStrings {
    public static void main(String[] args){
        double studentGPA = 8.7;
        String studentFirstName = "Diego";
        String studentLastName = "Escobedo";

        System.out.println(studentFirstName + " " +studentLastName + " has a GPA of " + studentGPA);
        System.out.println("Do you want update another number to the GPA?");
        Scanner input = new Scanner(System.in);
        studentGPA = input.nextDouble();
        System.out.println(studentFirstName + " " +studentLastName + " now has a GPA of " + studentGPA);
    }
}
