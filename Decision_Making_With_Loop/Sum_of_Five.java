package Decision_Making_With_Loop;

import java.util.Scanner;

public class Sum_of_Five {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		
		int a,i,x;
		int sum=0;
		System.out.println("Enter five ");
			
			for(i=0;i<5;i++)
				{
					x=scan.nextInt();
					sum+=x;
				}
		System.out.println("sum = "+sum);
	}

}
