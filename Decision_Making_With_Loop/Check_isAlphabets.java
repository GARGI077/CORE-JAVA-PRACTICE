package Decision_Making_With_Loop;

import java.util.Scanner;

public class Check_isAlphabets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter A character ");
			char ch=scan.next().charAt(0);
	
		if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
			System.out.println(ch+" Is a Alphabet ");
		else 
			System.out.println("Not an Alphabet ");
	}

}
