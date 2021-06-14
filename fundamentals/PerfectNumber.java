package completejava;
import java.util.Scanner;
public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 6-> 1  2  3(factors)
 * if we ADD the factors and the sum is equal ot the no
 * 1+2+3=6
 *  
 */

	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number");
	int x=s.nextInt();
	
	int i,sum;
	sum=0;
	for(i=1;i<x;i++)
	{
		if(x%i==0)
		{
			sum=sum+i;
		}
	
	}
	
	if(sum==x)
	{
		System.out.printf("%d is a perfect  number " ,x);
	}
	else
		System.out.printf("%d is not a perfect number ", x);
	}

}
