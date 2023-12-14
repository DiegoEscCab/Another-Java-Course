import javax.swing.*;
public class GetLargeNameJOptionPane {
    public static void main(String[] args) {
        String person1 = JOptionPane.showInputDialog("Enter your full name:");
        String person2 = JOptionPane.showInputDialog("Enter your full name:");
        String person3 = JOptionPane.showInputDialog("Enter your full name:");

        String max = (person1.split(" ")[0].length() < person2.split(" ")[0].length()) ? person2 : person1;
                    max = (person3.split(" ")[0].length() < max.split(" ")[0].length() ? max : person3);

        System.out.println(max);
    }
}
