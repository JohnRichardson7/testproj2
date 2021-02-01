package assignments;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		int number,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to reverse");
		number=sc.nextInt();
		while(number>0)
		{
		temp=number%10;
		System.out.print(temp);
		number=number/10;
		}
	}
}
