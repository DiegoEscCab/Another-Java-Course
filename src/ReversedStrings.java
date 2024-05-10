public class ReversedStrings {
    /**Complete the solution so that it reverses the string passed into it.
     'world'  =>  'dlrow'
     'word'   =>  'drow'*/
    public static void main(String[] args) {
        String str = "Hi to all, good morning!";
        String reverse = "";

        for (int i = str.length()-1; i >= 0; i--){
            char c = str.charAt(i);
            reverse += c;
        }
        System.out.println(reverse);
    }
}
