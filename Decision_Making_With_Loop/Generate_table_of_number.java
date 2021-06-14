package Decision_Making_With_Loop;

import java.util.Scanner;

public class Generate_table_of_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter a value ");
			int n=scan.nextInt();
		
		int fact=1;
		
		for(int i=1;i<=10;i++)
		{
			fact=n* i;
			System.out.println(n + " * " + i +" = "+fact);
		}
	}

}
