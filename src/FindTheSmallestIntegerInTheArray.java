public class FindTheSmallestIntegerInTheArray {
    /**
     * Given an array of integers your solution should find the smallest integer.
     * For example:
     * Given [34, 15, 88, 2] your solution will return 2
     * Given [34, -345, -1, 100] your solution will return -345
     * You can assume, for the purpose of this kata, that the supplied array will not be empty.
     **/
    public static void main(String[] args) {
        int[] numbers = {34, -345, -1, 100};
        int smallest = Integer.MAX_VALUE;
        if (numbers == null) {
            System.out.println("Array is empty");
        } else {
            for (int number : numbers) {
                if (number < smallest) {
                    smallest = number;
                }
            }
            System.out.println(smallest);
        }
    }
}
