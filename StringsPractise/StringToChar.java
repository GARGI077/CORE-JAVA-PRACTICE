package StringsPractise;

import java.util.Scanner;

public class StringToChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		
		String str;
		
		System.out.println("Enter a line");
		
		str=s.nextLine();
		
		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			
			System.out.println("Character At "+i+" Position:"+c);
			
		}
	}

}
