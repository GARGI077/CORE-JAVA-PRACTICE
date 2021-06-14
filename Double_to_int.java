package TypeConversions;

import java.util.Scanner;

public class Double_to_int {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter a  Double value ");
		
			double d=scan.nextDouble();
		
		int a=(int)d;
		
		System.out.println("Double VAlUE : " + d + "\nInteger conversion : " + a);

	}

}
