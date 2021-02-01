package assignments;

import java.util.Scanner;

public class SwapNumbers {
public static void main(String[] args) {
	int num1;
	int num2;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Two Numbers");
	num1=sc.nextInt();
	num2=sc.nextInt();
	num1=num1+num2;
	num2=num1-num2;
	num1=num1-num2;
	System.out.println("After Swapping " + num1 +" " + num2);
}
}
