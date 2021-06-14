package Decision_Making_With_Loop;

import java.util.Scanner;

public class Hcf_of_two_nos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter No 1 : ");
			int x=s.nextInt();
		System.out.println("Enter No 2 : ");
			int y=s.nextInt();
			int hcf=0;
		for(int i=1;i<=x&&i<y;i++)
		{
			if(x % i == 0 && y % i == 0)
				hcf=i;
		}
		
		System.out.println("HCF of "+ x +" & "+ y +" is "+ hcf);
	}

}
