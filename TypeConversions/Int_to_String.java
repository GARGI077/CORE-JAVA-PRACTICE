package TypeConversions;

import java.util.Scanner;

public class Int_to_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter an integer value ");
		int val=scan.nextInt();
		
		String str=Integer.toString(val);
		
		System.out.println("Int value : " + val + "\nString coversion : " + str);
	}

}
