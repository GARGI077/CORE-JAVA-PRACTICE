package Decision_Making_With_Loop;

import java.util.Scanner;

public class Check_positiveOr_negative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter a number ");
			int num=scan.nextInt();
		
			if(num>0)
				System.out.println(num + " Positive number ");
			else 
				if(num<0)
					System.out.println(num+" Negative number ");
			
	}

}
