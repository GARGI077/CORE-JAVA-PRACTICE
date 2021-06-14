/*
 *   FIBONACCI
 *   1 1 2 3 5 8 13 21 ......n
 */

package completejava;
import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int k,a=1,b=1;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any number");
		int n = s.nextInt();
		k=0;
		
		System.out.print(" 1 1 ");
		
		while(k<=50)
		{
			k=a+b;
			System.out.print(k  +" ");
			a=b;
			b=k;
		}
		
	}

}
