package Decision_Making_With_Loop;

import java.util.Scanner;

public class Lcm_of_nos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);

		System.out.println("Enter Value 1 : ");
			int x=s.nextInt();
		System.out.println("Enter value 2 : ");
			int y=s.nextInt();
		int hcf =0;
		int lcm;
		
		for(int i=1;i<=x&&i<=y;i++)
			{
				if(x%i==0&&y%i==0)
					hcf=i;
			
			}

		lcm = (x * y)/hcf;
		
		System.out.println("LCM of "+ x + " & "+ y +" is "+ lcm);
	
	}

}
