package StringsPractise;

import java.util.Scanner;

public class RevString {
		
	public void revString(String str)
	{
		String[] words=str.split(" ");
		String revstring="";
		
		for(int i=0;i<words.length;i++)
		{
			String word=words[i];
			String revword="";
			
			for(int j=word.length()-1;j>=0;j--)
			{
				revword=revword+word.charAt(j);
			}
			
			revstring=revstring+revword+"";
		
		}
		
		System.out.println(str);
		System.out.println(revstring);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		System.out.println("enter a line");
		String Ss=s.nextLine();
		RevString r=new RevString();
		
		r.revString(Ss);
	}

}
