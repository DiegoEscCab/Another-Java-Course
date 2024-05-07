public class ReturningStrings {
    /**Make a function that will return a greeting statement that uses an input;
     * your program should return, "Hello, <name> how are you doing today?".
     * [Make sure you type the exact thing I wrote or the program may not execute properly]*/
    public static void main(String[] args) {
        String name = "Diego";
        String greeting = String.format("Hello, %s how are you doing today?", name);
        System.out.println(greeting);
    }
}
