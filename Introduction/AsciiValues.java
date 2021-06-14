package Introduction;

import java.util.Scanner;

public class AsciiValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
			
		System.out.println("Enter a charachter ");
			char ch=scan.next().charAt(0);
			
			int casting=(int) ch;
			
			System.out.println("Int value of ASCII char "+ ch +" is "+ casting);
		
	}

}
