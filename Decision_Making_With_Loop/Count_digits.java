package Decision_Making_With_Loop;

import java.util.Scanner;

public class Count_digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter a value ");
			int n=scan.nextInt();
		int count =0;
		
		while(n!=0)
		{
			n=n/10;
			++count;
		}
		System.out.println("the value "+ n +" is "+ count + " digit no");

	}

}
