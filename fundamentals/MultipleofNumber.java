package completejava;
import java.util.Scanner;
public class MultipleofNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		
		int i,fact,num;
		
		System.out.println("enter the number ");
		
		num=s.nextInt();
		fact=1;
		
		for(i=1;i<=10;i++)
		{
			fact=num*i;
			System.out.printf("\n %d * %d = %d",num,i,fact);
		}
		
		
	}

}
