public class PalindromeString {
    public static void main(String[] args) {
    String s = "A man, a plan, a canal: Panama";
    String result = "";
    char c ;
    s = s.toLowerCase().replaceAll("[^a-zA-Z0-9]+", "");

        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            result = c + result;
        }
        if (s.equals(result)){
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        System.out.println(result);
    }

}
