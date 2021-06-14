package StringsPractise;

import java.util.Scanner;

public class FindDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		
		String str;
		
		System.out.println("the line is");
		
		str=s.nextLine();
		
		int cnt=0;
		
		char[] inp=str.toCharArray();
		
		
		
		for(int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<str.length();j++)
			{
				if(inp[i]==inp[j])
				{
					System.out.println(inp[j]);
					cnt++;
					break;
				}

	
				
			}
			
		}
	}

}
