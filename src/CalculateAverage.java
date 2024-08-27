public class CalculateAverage {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        double result = 0;
        double sum = 0;
        double length = 0;

        if(array == null || array.length == 0){
            System.out.println("Empty or null array");
        } else {
            for(int num : array){
                length = array.length;
                sum += num;
                result = sum / length;
            }
        }
        System.out.println(result);
    }
}
