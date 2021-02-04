package assignments;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		String input;
		StringBuilder sbuilder = new StringBuilder();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string");
		input = scanner.nextLine();
		char[] array = input.toCharArray();
		for (int index = array.length - 1; index >= 0; index--) {
			sbuilder = sbuilder.append(array[index]);
		}
		System.out.println("After reversing " + sbuilder);
	}
}
