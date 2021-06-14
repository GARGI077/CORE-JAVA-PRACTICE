package Introduction;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter a no ");
		int num=scan.nextInt();
		
		if(num%2==0)
			System.out.println("Even number ");
		else if(num%2!=0)
			System.out.println("Odd Number ");
	}

}
