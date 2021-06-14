/*
 * 7 factorisation will be 7*6*5*4*3*2*1
 *  n*(n-1)*..1
 
* */

package completejava;

import java.util.Scanner;

public class Factorization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		 
		System.out.println("enter a number ");
		 
		int num=s.nextInt();

		int i;
		long fact=1;
		
		for(i=num;i>=1;i--)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of the number is "+fact);
	}

}
