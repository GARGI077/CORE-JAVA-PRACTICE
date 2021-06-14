package TypeConversions;

import java.util.Scanner;

public class Long_to_Int {
	
	public static void main(String args[])
	{
		Scanner scan =new Scanner(System.in);
		
		System.out.println("Enter Long value ");
			long l=scan.nextLong();
			
			int x=(int)l;
			
			System.out.println("long value : " + l +"\nInt conversion : "+x);
		
		
	}

}
