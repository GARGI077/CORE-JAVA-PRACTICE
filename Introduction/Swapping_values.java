package Introduction;

import java.util.Scanner;

public class Swapping_values {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);

		System.out.println("Enter value one ");
			int x=scan.nextInt();
		System.out.println("Enter value two ");
			int y=scan.nextInt();
			
	int temp;
	System.out.println("Values before swapping\nValue one : "+ x +"\nValue two : "+ y );
		temp=x;
		x=y;
		y=temp;
		
   System.out.println("\nValues after swapping\nValue one : " + x+"\nValue two : "+ y );
   
   System.out.println("Enter line one");
      		String a=scan.nextLine();
   System.out.println("Enter line two ");
   			String b=scan.nextLine();
   			
   System.out.println("Lines before Swapping \nLine one : " + a +"\nLine two : "+ b);
   			
   	String t;
   	
   	t=a;
   	a=b;
   	b=t;
   	
   	System.out.println("Lines After Swapping\nLine One : "+ a +"\nLine Two : "+ b);
	
	
	
	
	}

}
