package completejava;

public class MaxNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a,b,c,max;
		a=5;
		b=2;
		c=9;
		System.out.println("A = "+a+"\nB = "+b+"\nC = "+c);  
		if(a>b&&a>c)
		{
			max=a;
		}
		
		else if(b>c)
		{
			max=b;
		}
		else
			max=c;
		
		System.out.println("Maximum no is "+ max);
	}

}
