package ClassTopic;
import java.util.Scanner;
public class Calculator {

	public static int Add(int a,int b)
	{
		return(a+b);
	}
	
	public static int product(int a,int b)
	{
		return(a*b);
	}
	public static int Differ(int a,int b)
	{
		if(a>b)
			return(a-b);
		else 
			return(b-a);
	}
	
	
	public static void main(String[] args) {
			// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		
		System.out.println("enter the values of a and b");
		
		int x=s.nextInt();
		int y=s.nextInt();
		int result;
		System.out.println("enter the choice for menu\n1.Sum\n2.Product\n3.Difference\n");
		int choice=s.nextInt();
		switch(choice)
		{
		case 1:
			result=Add(x,y);
			System.out.println("Sum of numbers is "+result);
			break;
		
		case 2:
			result=product(x,y);
			System.out.println("Product of numbers is "+result);
			break;
		
		case 3:
			result=Differ(x,y);
			System.out.println("Difference of numbers is "+result);
			
		}
	
	}

}
