package Introduction;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Round_of_Decimal_places {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);  
		
		System.out.println("Enter a decimal number ");
		
			double d=scan.nextDouble();
			
		System.out.format("Value after round off "+"%.2f",d);//formatting type 1
		
		System.out.println("\nenter value ");
		double dd=scan.nextDouble();
		
		System.out.println(" VALUE : "+dd);
	
		DecimalFormat df =new DecimalFormat("#.###");
			df.setRoundingMode(RoundingMode.CEILING);
				System.out.println("round off value "+df.format(dd));

	}

}
