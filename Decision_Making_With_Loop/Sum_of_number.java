package Decision_Making_With_Loop;

import java.util.Scanner;

public class Sum_of_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
	    System.out.println("Enter the Nth value of Natural Numbers  ");
	    	int n=scan.nextInt();
	    int sum=0;	
	    
	    for(int i=1;i<=n;i++)
	     {
	    	sum+=i;
	     }
	    
	    System.out.println("Sum of N natural number : " + sum);
	}

}
