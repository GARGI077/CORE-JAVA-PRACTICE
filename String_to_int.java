package TypeConversions;

import java.util.Scanner;

public class String_to_int {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter a String ");
		
			String str=scan.next();
			
			int len=str.length();
			 //int x[]=new int[len];
			
			try 
			{
				for(int i=0;i<len;i++)
					
				{
					 int x=str.charAt(i);
				
		System.out.println("String  : "+ str.charAt(i) + "\n Int Conversion : " + x);
		}
			}catch (NumberFormatException ne)
			{
				System.out.println(ne);
			}
			 
			 /*
			 for(int i=0;i<len;i++)
			 {
				 System.out.println(str.charAt(i));
			 }*/
		
	
		
	}

}
