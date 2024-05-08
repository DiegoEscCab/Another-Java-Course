import java.util.Arrays;

public class LostWithoutAMap {
    /**Given an array of integers, return a new array with each value doubled.
     For example:
     [1, 2, 3] --> [2, 4, 6]*/
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int[] doublearr = new int[arr.length];
        for(int i =0; i < arr.length; i++){
            doublearr[i]= arr[i]*2;
        }
        System.out.println(Arrays.toString(doublearr));
    }
}
