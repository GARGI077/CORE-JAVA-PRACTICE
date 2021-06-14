package completejava;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int x,r,num,rev,temp;
        num=0;
        Scanner s=new Scanner(System.in);
        
		System.out.println(" Enter the number ");
		int sum=0;
		x=s.nextInt();
		temp=x;
		while(x!=0)
		{
			r=x%10;
		    num=num*10+r;
		    x=x/10;
		    
		}
		
		rev=num;
		
		System.out.print("Reverse is "+ rev);
		
		if(temp==rev)
		{
			System.out.print(" number is a palindrome ");
			
		}
		/*
		 * the actual no is also copied to another variable as the no is not static and gets lost in the memory
		 * to ensure wheather the no is palindrome we 
		 * first need to copy the actual no X to another variable say Y
		 * then find its reverse
		 * and store that rev in the some  variable say K 
		 * and then compare Y and K 
		 */
	}

}
