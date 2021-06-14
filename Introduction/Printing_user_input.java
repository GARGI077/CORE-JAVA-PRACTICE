package Introduction;

import java.util.Scanner;

public class Printing_user_input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println(" Enter an 'integer' value : ");
				int a=scan.nextInt();
					System.out.println(" user input  'integer' data : " + a);

	   System.out.println("\n Enter a 'decimal' value : ");
	   			float b=scan.nextFloat();
	   				System.out.println("User input 'Float' data : " +  b);
	   				
	   System.out.println("\n Enter 'String' values :");
	   			String str=scan.next(); 
	   				System.out.println("User input 'String' data : "+ str );
	   				/*
	   System.out.println("\n Enter a String 'line' :");
	   			String str_line=scan.nextLine();
	   				System.out.println("User input 'Line' data : " + str_line);*/
	   				
	   System.out.println("\n Enter a  double value :");
	   		double d=scan.nextDouble();
	   			System.out.println(" User input 'Double' data :" + d );
	   			
	   System.out.println("\n Enter a 'boolean' value :");
	   		boolean bool=scan.hasNext();
	   			System.out.println("User input 'Boolean' values : " + bool);
	
	   System.out.println("\n Enter a 'byte' value :");
	   		byte by=scan.nextByte();
	   			System.out.println("User input 'Byte' value : " + by);
	   			
	   	System.out.println("\n Enter a Charachter value  : ");
	   		char ch=scan.next().charAt(0);
	   			System.out.println("User input 'Charachter' value : " + ch );
	
	   System.out.println("\n Enter a short value : ");
	   		short sh=scan.nextShort();
	   			System.out.println("User input 'Short value ' : "+ sh);
	   			
	   System.out.println("\n Enter Long value : ");
	   		long l=scan.nextLong();
	   			System.out.println("User input 'long' value : "+ l);
	   			
	   
	}

}
