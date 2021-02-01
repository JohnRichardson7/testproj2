package assignments;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AddNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1=0;
		int num2=0;
		int sum;
		boolean flag=true;
		do
		{
			try
			{
				System.out.println("Enter two numbers");
				num1=sc.nextInt();
				num2=sc.nextInt();
				sum=num1+num2;
				System.out.println("The sum of two integer is " + sum);
				flag=false;
			}
			catch(InputMismatchException e){
				System.out.println("Enter only integer value");
				flag=false;
			}
		}while(flag);
		
		
	}

}
