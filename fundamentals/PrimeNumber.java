package completejava;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the number");
		
		int x=s.nextInt();
		
		boolean isPrime=true;
		/*
		 * if there are no factors of the number then the number is prime 
		 */
		for(int i=2;i<x;i++)
		{ 
			if(x%i==0)
			{
				isPrime=false;
				break;
			}
		}
			
		if(isPrime)
		{
			System.out.println(x+" is a prime number ");
			
		}
		else 
			System.out.println(x+" composite number ");
	}

}
