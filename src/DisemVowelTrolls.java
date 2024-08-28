public class DisemVowelTrolls {
    public static void main(String[] args) {

        String str = "Th[is website is for losers LO]L!";
        String vowels = "AaEeIiOoUu";
        StringBuilder result = new StringBuilder();

        for(char c : str.toCharArray()){
            if(vowels.indexOf(c) == -1){
                result.append(c);
            }
        }
        System.out.println(result);
    }
}
