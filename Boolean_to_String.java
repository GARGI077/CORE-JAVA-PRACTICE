package TypeConversions;

import java.util.Scanner;

public class Boolean_to_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter boolean value ");
			boolean b=scan.nextBoolean();
		System.out.println("Boolean value : "+b);
		
		String str=String.valueOf(b);
		
		System.out.println("String conversion : "+str );
	}

}
