package TypeConversions;

import java.util.Scanner;

public class Sring_to_boolean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		
		System.out.println(" Enter true/false ");
		
			String str=scan.nextLine();
			
		boolean b=Boolean.parseBoolean(str);
		
		System.out.println(b);
		
		
	}

}
