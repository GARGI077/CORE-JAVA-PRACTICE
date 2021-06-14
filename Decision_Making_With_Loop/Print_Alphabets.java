package Decision_Making_With_Loop;

public class Print_Alphabets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char ch;
		
		System.out.println("Uppercase Alphabets ");
		for(ch='A';ch<='Z';++ch)
		{
			System.out.print(ch+" ");
		}
		
		System.out.println("\nLowercase Alphabets ");
		for(ch='a';ch<='z';++ch)
			System.out.print(ch+" ");
	}

}
