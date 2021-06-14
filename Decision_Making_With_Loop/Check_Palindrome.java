package Decision_Making_With_Loop;

import java.util.Scanner;

public class Check_Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		/*System.out.println("Enter a number ");
			int n=s.nextInt();
		int temp=n,rev=0,rem=0;
		
		while(n!=0)
		{
			rem=n%10;
			n=n/10;
			rev=(rev*10)+rem;
		}
		
		System.out.println("Number : "+ temp+"\nreverse : "+rev);
		
		if(rev==temp)
		{
			System.out.println("Palindrome no");
		}else
			System.out.println("Not a Palindrome ");
		*/
		
		System.out.println("Enter a string ");
			String str=s.next();
		String rev_str = "";
		String str_temp=str;
		int len=str.length();
		try {
		for(int i=len-1;len!=0;i--)
		{
			rev_str+=str.charAt(i);
		}
	
	
	}catch (IndexOutOfBoundsException e)
		{
	//	System.out.println(e);
	}
		finally {
			System.out.println("String  " + str_temp+"\nReverse : "+ rev_str);
			
			if(str.equals(rev_str))
			{
				System.out.println("STRING IS PALINDROME ");
			}
			else 
				System.out.println("String is Not PALINDROME");
		}
	}
}
