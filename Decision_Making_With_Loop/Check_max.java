package Decision_Making_With_Loop;

import java.util.Scanner;

public class Check_max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter num 1 ");
			int a=scan.nextInt();
		
		System.out.println("Enter num 2 ");
			int b=scan.nextInt();
		System.out.println("Enter num 3 ");
			int c=scan.nextInt();
			
			int max=0;
			
			if(a>b&&a>c)
				max=a;
			else
				if(b>c)
					max=b;
			else
					max=c;
			
		System.out.println("Maximum numbers " + max );
			
	}

}
