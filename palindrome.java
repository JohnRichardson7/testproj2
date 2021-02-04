package assignments;

import java.util.Scanner;

public class palindrome {
	public static void main(String[] args)
	{
		int palindromeNo;
		int number, temporary,reversed=0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number");
		palindromeNo= Integer.parseInt(scanner.next());
		number=palindromeNo;
		while (number > 0) {
			temporary = number % 10;
			reversed=reversed*10+temporary;
			number = number / 10;
		}
	if(palindromeNo==reversed)
	{
		System.out.println("The given number is a palindrome");
	}
	else
	{
		System.out.println("The given number is not a palindrome");

	}
	
	}
	
}
