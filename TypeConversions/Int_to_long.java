package TypeConversions;

import java.util.Scanner;

public class Int_to_long {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter a integer value ");
		
			int x=scan.nextInt();
			
		long l=x; //type casting to long 
		
		System.out.println("Int Value : "+x +"\nLong Conversion : "+l);
	}

}
