public class GradeBook {
    /**
     * Complete the function so that it finds the average of the three scores passed to it and returns the letter value associated with that grade.
     * Numerical Score	Letter Grade
     * 90 <= score <= 100	'A'
     * 80 <= score < 90	'B'
     * 70 <= score < 80	'C'
     * 60 <= score < 70	'D'
     * 0 <= score < 60	'F'
     * Tested values are all between 0 and 100. Theres is no need to check for negative values or values greater than 100.
     */
    public static void main(String[] args) {
        int s1 = 100;
        int s2 = 100;
        int s3 = 100;
        char result = 0;
        int score = (s1 + s2 + s3) / 3;
        if (score <= 100 && score >= 90) {
            System.out.printf(String.valueOf(result = 'A'));
        } else if (score < 90 && score >= 80) {
            System.out.printf(String.valueOf(result = 'B'));
        } else if (score < 80 && score >= 70) {
            System.out.printf(String.valueOf(result = 'C'));
        } else if (score < 70 && score >= 60) {
            System.out.printf(String.valueOf(result = 'D'));
        } else if (score < 60 && score >= 0) {
            System.out.printf(String.valueOf(result = 'F'));
        }
    }
}
