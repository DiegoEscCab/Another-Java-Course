package core.diego.esc;

import java.util.Scanner;

public class InputAndOutput {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your name:");
		String name = scanner.nextLine();
		System.out.println("Hello " + name);
		scanner.close();
	}

}
