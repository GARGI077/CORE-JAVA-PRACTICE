package Decision_Making_With_Loop;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
	
		System.out.println("Enter the number ");
			int val=scan.nextInt();
	
		int fact=1;	
		
		for(int i=val;i!=0;i--)
		{
			fact= fact * i ;
			
		}
		
		System.out.println("value "+ val +"\nFactorial : "+ fact);

	}

}
