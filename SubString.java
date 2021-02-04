package assignments;

import java.util.Scanner;

public class SubString {
public static String stringPresent() {
	
	String input;
	String substring;
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the main String");
	input=scanner.nextLine();
	System.out.println("Enter the subString");
	substring=scanner.nextLine();
	if(input.contains(substring))
	{
		return "The input contains the substring";
	}
	else
	{
		return "The input does not contains the substring";

	}
	
}
}
