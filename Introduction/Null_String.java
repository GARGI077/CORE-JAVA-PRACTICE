package Introduction;

import java.util.Scanner;

public class Null_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan =new Scanner(System.in);
		
		System.out.println("Enter a line ");
			String str =scan.nextLine();
			
	if(isNull(str))
	
		System.out.println("String is Null / Empty");
	
	else 
		System.out.println("String is ot null or empty");
		
	}


	public static boolean isNull(String s)
	{
		if(s!=null&& !s.isEmpty())
			return false;
		
		return true;
	}

}
