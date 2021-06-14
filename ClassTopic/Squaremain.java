package ClassTopic;
import java.util.Scanner;
public class Squaremain {

	public static int square(int n)
	{
		return(n*n);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		
		System.out.println("enter the number");
		
		int x=s.nextInt();
		
		int result=square(x);
		
		System.out.println("the Square of number "+result);
	}

}
