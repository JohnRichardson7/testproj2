package assignments;

import java.util.Scanner;

public class PrimeNumbers {
	public static void main(String[] args) {
		int range,flag=0;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the range for prime numbers");
		range=scanner.nextInt();
		System.out.println("The prime numbers are");
		for(int index=1;index<=range;index++)
		{
			flag=0;
			if((index%2)!=0)
			{
				for(int index1=3;index1<=(index/2);index1++)
				{
					if(index%index1==0)
					{
						flag=1;
					}
				}
				if(flag==0)
				{
					System.out.println(index);
				}
			}
		
		}
	}
}
