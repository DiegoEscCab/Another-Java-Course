
public class SumWithoutHighestAndLowestNumber {
    public static void main(String[] args) {
        int[] numbers = { 6, 2, 1, 8, 10 };
        int max = numbers[0];
        int min = numbers[0];

        for(int num : numbers) {
            if(num > max){
                max = num;
            }
            if(num < min){
                min = num;
            }
        }

        int result = 0;
        for(int num : numbers){
            if(num != max && num != min){
                result += num;
            }
        }
        System.out.println(result);
        System.out.println(min);
        System.out.println(max);
    }
}
