package Introduction;

import java.util.Scanner;

public class Largest_in_three {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("enter value one : ");
		int a=scan.nextInt();
		System.out.println("Enter value two : ");
		int b=scan.nextInt();
		System.out.println("Enter third value : ");
		int c=scan.nextInt();
		
		int max=0;
		
		if(a>b&&a>c)
			max=a;
		else if(b>c)
			max=b;
		else 
			max=c;
		
		System.out.println("Maximum number is "+max);
		
		
	}

}
