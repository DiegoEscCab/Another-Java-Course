public class FakeBinary {
    /**Given a string of digits, you should replace any digit below 5 with '0'
     * and any digit 5 and above with '1'.
     * Return the resulting string.
     Note: input will never be an empty string*/
    public static void main(String[] args) {
        String numberString = "45385593107843568";
        String result = "";
        for (int i = 0; i < numberString.length(); i++){
            char ch = numberString.charAt(i);
            if(ch < '5'){
                result += "0";
            } else
                result += "1";
        }
        System.out.println(result);
    }
}
