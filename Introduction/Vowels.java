package Introduction;

import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter any charachter");	
		
			char ch=scan.next().charAt(0);
			
if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U')
	System.out.println(" Character is a Vowels ");
else 
	System.out.println(" Consonant ");
	
	}

}
