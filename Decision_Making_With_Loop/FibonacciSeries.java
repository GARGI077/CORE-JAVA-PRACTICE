package Decision_Making_With_Loop;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stubd
		Scanner scan=new Scanner(System.in);
		
		System.out.println(" enter the n th value  ");
			int val=scan.nextInt();
			
		int a=0;
		int b=0;
		int sum=0;
		
		for(int i=0;i<=val;i++)
		{
			System.out.print(a +",");
			
			sum=a+b;
			a=b;
			b=sum;
			
			a++;
			
			
		}

	}

}
