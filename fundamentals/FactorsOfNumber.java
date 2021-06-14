package completejava;

import java.util.Scanner;

public class FactorsOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		
		System.out.println(" Enter a number ");
		
		int num =s.nextInt();
		
		 
		for(int i=1;i<num;i++)
		{
			if(num%i==0)
			{
				System.out.print(i+" ");
			} 
		}
		
		
	}

}
