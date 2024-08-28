public class IfYouCantSleepJustCountSheep {
    public static void main(String[] args) {
        int num = 5;
        String result = "";
        if(num > 0){
            for(int i = 1; i <= num; i++){
                result += (i + " sheep...");
            }
        }
        System.out.println(result);
    }
}
