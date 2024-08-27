public class RemoveFirstandLastCharacter {
    public static void main(String[] args) {
        String input = "Hello";
        String output = "";
        int index = 0;
        for(char ch : input.toCharArray()){
            if(index > 0 && index < input.length()-1){
                output += ch;
            }
            index++;
        }
        System.out.println(output);
    }
}
