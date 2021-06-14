package Decision_Making_With_Loop;

import java.util.Scanner;

public class Quadratic_equation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		
		double r_a,r_b;
		
		System.out.println("enter 'a' ");
			int a=scan.nextInt();

		System.out.println("Enter 'b'");
			int b=scan.nextInt();
	
		System.out.println("Enter constan 'c' ");
			int c=scan.nextInt();
			
		double dt=(b*b)- (4*(a*c));
		
		if(dt>0)
		{
			r_a= (-b + Math.sqrt(dt))/(2*a);
			r_b=(-b - Math.sqrt(dt))/(2*a);
			
			System.out.printf("root 1 = %.2f \n root 2 = %.2f ",r_a,r_b );
		}
		else 
			if(dt==0)
			{
				r_a=r_b=-b/(2*a);
				
				System.out.printf("\nRoot 1=Root 2 = %.2f", r_a);
			}
			else
			{
				double realpart=-b/(2*a);
				double imaginarypart=Math.sqrt(-dt)/(2*a);
				
				System.out.printf("\nRoot 1= %.2f+%.2f \nRoot 2= %.2f-%.2f", realpart,imaginarypart, realpart,imaginarypart);
			}
		
		
	}

}
