package StringsPractise;

import java.util.Scanner;

public class Intro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		String s,t;
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the line in small letter\n");
		
		s=scan.nextLine();//inputs the string values
		
		System.out.println("the line is\t"+s);
	
		t=s.toUpperCase();//converts the string to the upper case letters 
		
		System.out.println("Line in upper case "+t);
		
		t=t.toLowerCase();
		
		System.out.println(" Lower case conversion "+t);
		char c;
		System.out.println( );
		String r=new String();
		
		System.out.println("enter another string ");
		r=scan.nextLine();
		
		System.out.println(s.contains(r));//check whether the given string contains this  string or not 
		
		System.out.println(s.concat(r));//concatnate two strings
		
		System.out.println(r.length());//returns the length of the given string
		
		String str=new String();
		
		System.out.println("Enter the string");
		str=scan.nextLine();
		
		System.out.println(str.isEmpty());
		
		
	}

}
