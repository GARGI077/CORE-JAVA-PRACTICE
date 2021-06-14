package completejava;

import java.util.Scanner;

public class SwapWithVar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		
		int a,b,temp;
		
		System.out.println("Enter A number ");
		
		a=s.nextInt();
		
		System.out.println("Enter B number ");
		
		b=s.nextInt();
		
	    temp=a;
	    a=b;
	    b=temp;
	    
	    System.out.println("After Swap ");
	    System.out.println("A : "+a);
	    System.out.println("B : "+b);
	    
	}

}
