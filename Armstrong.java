package assignments;

import java.util.Scanner;

public class Armstrong {
	public static void main(String[] args) {
	int number,result=0,remainder;
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the number");
	number=scanner.nextInt();
	int numbercopy=number;
	while(number>0)
	{
		 remainder = number%10;
		result+=remainder*remainder*remainder;
		number=number/10;
	}
	if(numbercopy==result)
	{
		System.out.println("The given number is an armstrong number");
	}
	else
	{
		System.out.println("The given number is not an armstrong number");

	}
}
}
