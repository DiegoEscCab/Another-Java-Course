import java.util.Scanner;

public class ChallengeMultipleChoice {

    public static void main(String[] args) {
        String question = "What plush is on my PC?" +
                "\nChoice the correct answer writing the word";
        String choiceOne = "Darius";
        String choiceTwo = "Siren";
        String choiceThree = "Nessie";

        String correctAnswer = choiceThree;
        // TODO: Print la question statement
        System.out.println(question);
        // TODO: Print the question with all the answers to choice
        System.out.println(choiceOne+"\n"+choiceTwo+"\n"+choiceThree);
        // TODO: Have a user input the answer
        Scanner scanner = new Scanner(System.in);
        // TODO: Retrieve the user's input
        String input = scanner.next();
        // TODO: If the answer is correctAnswer
        if (correctAnswer.equals(input)){
            // TODO: print out a congrats message to the user
            System.out.println("Congratulations, your answer it's correct");
            // TODO: print out a message saying is incorrect
        } else {
            System.out.println("The answer is wrong, the correct answer is Nessie");
        }






    }
}
