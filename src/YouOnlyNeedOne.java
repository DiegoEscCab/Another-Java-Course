public class YouOnlyNeedOne {
    /**You will be given an array a and a value x.
     All you need to do is check whether the provided array contains the value.
     Array can contain numbers or strings. X can be either.
     Return true if the array contains the value, false if not.*/
    public static void main(String[] args) {
        Object[] a = {1,2,3,4,5,6,7,8,9};
        Object b = 10;
        boolean result = false;
        for(Object x : a) {
            if(x == b){
                result = true;
                break;
            } else {
                result = false;
            }
        }
        System.out.println(result);
    }
}
