/**Take an array and remove every second element from the array. Always keep the first element and start removing with the next element.
 Example:
 ["Keep", "Remove", "Keep", "Remove", "Keep", ...] --> ["Keep", "Keep", "Keep", ...]
 None of the arrays will be empty, so you don't have to worry about that!*/
import java.util.*;
public class RemovingElements {
    public static void main(String[] args) {
            Object[] arr = {"Keep", "Remove", "Keep", "Remove", "Keep"};
            List<Object> result = new ArrayList<>();

            for(int i = 0; i < arr.length; i+=2){
                result.add(arr[i]);
            }
            System.out.println(result);

    }
}

