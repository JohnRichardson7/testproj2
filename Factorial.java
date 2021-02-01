package assignments;

import java.util.Scanner;

public class Factorial {
	public static int factorials(int calc)
	{
		if(calc==0)
		{
			return 1;
		}
		else
		{
			return (calc*factorials(calc-1));
		}
	}
	public static void main(String[] args) {
	int fact;
	int result;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number for factorial");
	fact=sc.nextInt();
	result=factorials(fact);
	System.out.println("The factorial of a number " +fact+"is "+result);
	}
}
