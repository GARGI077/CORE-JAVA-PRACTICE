package Decision_Making_With_Loop;

import java.util.Scanner;

public class Compare_Decimal_values {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		
		System.out.println("enter num 1 ");
			double a=scan.nextDouble();
		System.out.println("enter num 2 ");
			double b=scan.nextDouble();
			
		a=Math.round(a*1000);
			System.out.println("round off "+a);
		a=a/1000;
		
		b=Math.round(b*1000);
			System.out.println("round off "+b);
		b=b/1000;
		
		if(a==b)
			System.out.println("these values are SAME");
		else
			System.out.println("the values are DIFFERENT");
		
	}

}
