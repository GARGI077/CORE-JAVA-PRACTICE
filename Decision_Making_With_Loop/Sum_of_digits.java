package Decision_Making_With_Loop;

import java.util.Scanner;

public class Sum_of_digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter a value ");
			int n=scan.nextInt();
		int sum=0,rem=0;
		
		while(n!=0)
		{
			rem=n%10;
			n=n/10;
			sum+=rem;
			
		}
		
		System.out.println("The sum of digits is "+sum );
		
	}

}
