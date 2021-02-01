package assignments;

import java.util.Scanner;

public class FarenToCelci {

	public static void main(String[] args) {
		float farenheit;
		float celcius;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the degree in farenheit");
		farenheit=sc.nextFloat();
		celcius=(farenheit-30)/2;
		System.out.println("The Temperature is" + celcius +" C");
	}

}
