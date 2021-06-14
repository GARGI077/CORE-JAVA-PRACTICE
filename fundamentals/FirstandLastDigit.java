package completejava;

import java.util.Scanner;

public class FirstandLastDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("enter a number");
		
		int num=s.nextInt();
		
		int i,first_digit,last_digit;
		
		first_digit=num;
		
		while(first_digit>=10)
		{
			first_digit=first_digit/10;
		}
		
		last_digit=num%10;
		
		System.out.println(" First digit "+first_digit);
		System.out.println("Last digit "+last_digit);
		
		
		
		
		

	}

}
