package completejava;
import java.util.Scanner;
public class Lcm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner s=new Scanner(System.in);
		
		int a,b,gcd,lcm;
		gcd=1;
  
		System.out.println("enter A : ");

		a=s.nextInt();

		System.out.println("enter B : ");

		b=s.nextInt();

	    for(int i = 1; i <= a && i <= b; ++i)
	        {
	            // Checks if i is factor of both integers
	            if(a % i==0 && b% i==0)
	                gcd = i;
	        }
	    
	    lcm=(a*b)/gcd;
	    
	    System.out.println("the Lcm is "+lcm);
	    

		
		
	}

}
