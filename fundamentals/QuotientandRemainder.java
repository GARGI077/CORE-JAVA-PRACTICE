package completejava;
import java.util.Scanner;
public class QuotientandRemainder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int num,quotient,remainder;
		
		System.out.println("Enter a number");
		
		num=s.nextInt();
		
		System.out.println("enter the divisor");
		int divisor=s.nextInt();
		
		quotient=num/divisor;
		
		remainder=num%divisor;
		
		System.out.println(" Quotient : "+quotient);
		
		System.out.println("Remainder : "+remainder);
		
	
		
		
	 
	}

}
