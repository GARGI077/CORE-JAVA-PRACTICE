package completejava;
import java.util.Scanner;
public class RootsOFQuadraticEquation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Scanner s=new Scanner(System.in);
		double a,b,c,r_a,r_b;
		System.out.println("Enter Coefficients of X^2 ");
		a=s.nextDouble();
		System.out.println("Enter the coefficients X ");
		b=s.nextDouble();
		System.out.println("Enter the constant C ");
		c=s.nextDouble();
		double determinant=(b*b) - (4*a*c);
		
		//condition for real and different roots
		if(determinant>0)
		{ 
			r_a=(-b + Math.sqrt(determinant))/(2*a);
			r_b=(-b - Math.sqrt(determinant))/(2*a);
			
			System.out.printf("root 1 = %.2f \n root 2 = %.2f ",r_a,r_b );
			
		}
		
		else 
			if(determinant==0)
			{
				r_a=r_b=-b/(2*a);
				
				System.out.printf("\nRoot 1=Root 2 = %.2f", r_a);
				
			}
			else
			{
				double realpart=-b/(2*a);
				double imaginarypart=Math.sqrt(-determinant)/(2*a);
				
				System.out.printf("\nRoot 1= %.2f+%.2f \nRoot 2= %.2f-%.2f", realpart,imaginarypart, realpart,imaginarypart);
			}
		
		
	}

}
