/*
 *  153 -> 1  5  3
 *  	   1*1*1+5*5*5+3*3*3
 *  		1+125+27
 *  		153
 *  
 */


package completejava;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		
		System.out.print("Enter a number :  ");
		
		int x=s.nextInt();
		
	int r,num,temp;
	num=0; 	
	temp=x;
	
	while(x!=0)
	{
		r=x%10;
		num=num+r*r*r;
	    x=x/10; 
	}
	
	if(temp==num)
	{
	System.out.printf(" Amrstrong Number is %d ",num);
	
	}
	}

}
