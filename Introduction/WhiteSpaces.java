package Introduction;

import java.util.Scanner;

public class WhiteSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter a line ");
			String str=scan.nextLine();
		
		System.out.println("Line is : " + str);
		
		str=str.replaceAll("\\s+", "");
			System.out.println("Line after replacement " + str);
		
	}

}
