package TypeConversions;

import java.util.Scanner;

public class Int_to_Char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter integer value ");
			
		int x=scan.nextInt();
			
		char ch=(char)x;// type casting of char 
		
		System.out.println(" int value : "+ x + "\n Char : "+ch);

		System.out.println("Enter Integer value ");
				int y=scan.nextInt();
				
	 char c=Character.forDigit(y, y+1);
	 
	 	System.out.println("int value : "+ y +" \nChar : "+c);
	}

}
