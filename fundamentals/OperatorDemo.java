package completejava;

public class OperatorDemo {

	public static void main(String[] args) {
		
		/* Arithematic (+,-,*,/,%)
		 * bitwise &,|,^,>>,<<
		 * ++n;pre increment
		 * n++;post increment
		 * Relational operators ==,!=,<,>,<=,>=
		 * Logical operators   
		 */
		
		// TODO Auto-generated method stub

		int x=6,y=4 ,m=7;
		int a=x+y;
		int b=x-y;
		int c=x*y;
		double d=(double)x/y;
		int e=x%y;
		System.out.println("Sum "+a);
		System.out.println("Difference "+b);
		System.out.println("product "+c);
		System.out.println("Quotient "+d);
		System.out.println("Modulus "+e);
	    ++m;
	    System.out.println(m);
	    int n=m++;
	    System.out.println(n);
	    //the value of is 9 now
	    int j=++m;//adding 1 to m when m is 9 
	    System.out.println("the new value of n "+j);
	}

}
