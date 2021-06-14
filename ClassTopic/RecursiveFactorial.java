package ClassTopic;
import java.util.Scanner;
public class RecursiveFactorial {

	static int factorial(int n)
	{
		if(n!=0)
			return n*factorial(n-1);
		else 
			return 1; 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number "); 
		int x=s.nextInt();
		int result=factorial(x);
		
		System.out.println("Factorial of "+x+" is "+result);
		
	}

}
