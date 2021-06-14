package StringsPractise;
import java.util.Scanner;
public class Countalpa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		
		String str;
		
		System.out.println("enter a line ");
		str=s.nextLine();
		
		int v=0,c=0;

		str=str.toLowerCase();
		
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				v++;
			}
			else
				c++;
		}
		
		System.out.println("vowels "+v+"\n consonants "+c);
		
	}

}
