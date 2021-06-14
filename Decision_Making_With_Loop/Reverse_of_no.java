package Decision_Making_With_Loop;

import java.util.Scanner;

public class Reverse_of_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter a no");
			int num=scan.nextInt();
		int rev=0,rem=0,temp=num;
		
		while(num!=0)
		{
			rem=num%10;
			num=num/10;
			rev=(rev*10)+rem;
		}
		
		System.out.println("REVERSE of "+temp+" is "+ rev);
	}

}
