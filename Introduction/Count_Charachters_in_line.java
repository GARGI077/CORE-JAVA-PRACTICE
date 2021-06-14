package Introduction;

import java.util.Scanner;

public class Count_Charachters_in_line {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner scan=new Scanner(System.in);
		
	System.out.println("Enter a line ");
	
		String str=scan.nextLine();
	System.out.println("Enter word u want to count ");
		char ch=scan.next().charAt(0);
		
		int count=0;
		
		for(int i=0;i<str.length();i++)
		{
			if(ch==str.charAt(i))
				count++;
			
		}
		
		System.out.println("Count of charachter "+ ch +" is "+ count);
	
	
	}

}
