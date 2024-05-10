import java.util.Arrays;
public class DescendingOrder {
    /**Your task is to make a function that can take any non-negative integer
     *  as an argument and return it with its digits in descending order.
     *  Essentially, rearrange the digits to create the highest possible number.
     Examples:
     Input: 42145 Output: 54421
     Input: 145263 Output: 654321
     Input: 123456789 Output: 987654321*/
    public static void main(String[] args) {
        int num = 13542;
        String str = Integer.toString(num);
        String result = "";
        char[] digits = str.toCharArray();
        Arrays.sort(digits);

        for (int i = digits.length -1; i >= 0; i--){
            result += digits[i];
        }
        System.out.println(Integer.parseInt(result.toString()));

    }
}
