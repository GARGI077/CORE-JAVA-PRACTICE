package Introduction;

import java.util.Scanner;

public class Adding_two {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		
		System.out.println("TO calculate sum of Integers ");
			System.out.println("input value 1: ");
				int a=scan.nextInt();
			System.out.println("input value 2: ");
				int b=scan.nextInt();
			int int_sum=a+b;
			System.out.println("Sum of two integers : "+ int_sum );
		
			
		System.out.println("\n\nTo concatnate Two String ");
			System.out.println("input string one ");
				String sa=scan.next();
			System.out.println("input string two ");
				String sb=scan.next();
			String string_sum=sa+" "+sb;
			System.out.println("Sum of two String "+string_sum);
		
			
		
		
	/*	System.out.println("\n\n To Add to decimal numbers ");
				System.out.println(" input value 1: ");
					float f_a=scan.nextFloat();
					
				System.out.println("input value 2: "); 
					float f_b=scan.nextFloat();
				float float_sum=f_a + f_b;
				System.out.printf("Sum of Decimak nos : " + float_sum%.2f);
			
		*/
		
		
	}

}
