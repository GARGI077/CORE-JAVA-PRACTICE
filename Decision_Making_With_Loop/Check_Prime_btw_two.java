package Decision_Making_With_Loop;

import java.util.Scanner;

public class Check_Prime_btw_two {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the Start point ");
			int beg=s.nextInt();
		System.out.println("Enter the end point ");
			int end=s.nextInt();
			
		int flag,i,j;
		
		for(i=beg;i<=end;i++)
			{
				if(i==0||i==1)
					continue;
				flag=1;   
				
				for(j=2;j<i/2;j++)
					if(i%j==0)
						flag=0;
						break;
			}
	}

}
