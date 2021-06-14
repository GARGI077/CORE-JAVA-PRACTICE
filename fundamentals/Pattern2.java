package completejava;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 
		 * 	1
		 * 	0 1
		 *  1 0 1
		 *  0 1 0 1
		 *  1 0 1 0 1
		 */
	System.out.println("PATTERN 1");
	int i,j;
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=i;j++)
			{
				if((i+j)%2==0)
					System.out.print(" 1 ");
				else
					System.out.print(" 0 ");
			
			}
			System.out.println();
		}
		
		/*
		 * 
		 * 	1
		 *  2 2
		 *  3 3 3
		 *  4 4 4 4
		 *  5 5 5 5 5
		 */
		
		for(i=1;i<=5;i++)
		  {
			  for(j=1;j<=i;j++)
			   {
				  System.out.print(" "+i);
			   }
			System.out.println();
		}
		
		
	}

}
