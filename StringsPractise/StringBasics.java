package StringsPractise;
import java.util.Scanner;
public class StringBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		String str;
		System.out.println("Enter the line");
		str=scan.nextLine();
		String s=str.toLowerCase(); //to convert into lowercase
		System.out.println(" LOWER CASE OF line "+s);
		
		s=s.toUpperCase(); //to convert into uppercase
		
		System.out.println("UpperCase "+s);
		
		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);//to fetch the charachter at index position
			System.out.println(c);
		}
	}

}
