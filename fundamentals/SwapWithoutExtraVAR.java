package completejava;

import java.util.Scanner;

public class SwapWithoutExtraVAR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		
		int a,b;
		
		System.out.println(" Enter first  number");
		
		a=s.nextInt();
		
		System.out.println(" Enter Second Number ");
		
		b=s.nextInt();
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("After Swap ");
		
		System.out.printf("a : %d ",a);
		System.out.printf("\nb : %d",b);
		  
	
	
	}

}
