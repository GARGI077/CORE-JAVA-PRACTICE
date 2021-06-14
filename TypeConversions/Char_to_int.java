package TypeConversions;

import java.util.Scanner;

public class Char_to_int {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
						
				Scanner scan=new Scanner(System.in);
				
				System.out.println("Enter a charachter ");
				
					char ch=scan.next().charAt(0);
					
			   int  a=ch;
			   
			   System.out.println("char  : "+ ch +"\nint conversion : "+a);
			   
			   System.out.println("Enter a new Charachter ");
			   		char c=scan.next().charAt(0);
			   		
			   	int b=Integer.parseInt(String.valueOf(c));
			   	
			   	System.out.println("Char :" + c + "\nint conversion : "+ b);
		/*String.valueof(c) -> converts char value to string 
			   	& Ineger.parseInt() -> converts String value to integer 
			
			*/
			   	
			}

		


	}


