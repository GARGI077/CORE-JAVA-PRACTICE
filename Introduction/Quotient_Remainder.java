package Introduction;

import java.util.Scanner;

public class Quotient_Remainder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println(" Enter the divident ");
		 		int divident=scan.nextInt();
		 
		System.out.println("Enter a the divisior ");
				int divisor=scan.nextInt();
		
				
		float quotient=divident/divisor;
		int remainder=divident%divisor;
		
		
		System.out.println("\nDivident: "+ divident);
		System.out.println("\nDivisor : "+ divisor);
		System.out.println("\nQuotient = " + quotient);
		System.out.println("\nRemainder = "+ remainder);

	}

}
