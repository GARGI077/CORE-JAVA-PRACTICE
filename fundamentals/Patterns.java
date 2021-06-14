package completejava;

public class Patterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*
		 *   *
		 *   **
		 *   ***
		 *   ****
		 */
		
		int i,j;
		System.out.print("Pattern 1 \n");
		
		for(i=0;i<4;i++)
		{
			for(j=0;j<=i;j++)
			{
				System.out.print("*");
			} 
			    System.out.print("\n");
		}
		
		
		/*
		 *  ********
		 *  *      *
		 *  *      *
		 *  *      *
		 *  ********
		 *  
		 *  hint : print the boundary coordinates 
		 * 
		 */
		int x,y;
		System.out.println("Pattern 2");
		
		for(x=1;x<=4;x++)
		{
			for(y=1;y<=4;y++)
			{
				if(x==1||x==4||y==1||y==4)
				{
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}System.out.print("\n");
			
		}
		
		
		/*
		 * 	*
		 *  **
		 *  *  *
		 *  *   *
		 *  ******
		 * 
		 */
		System.out.println("Pattern 3");
		int k,l;
		for(k=1;k<=5;k++)
		{
			for(l=1;l<=k;l++)
			{
				if(k==1||k==5||l==5||l==1)
				{
					System.out.print("*");
				}
				else
					System.out.print("");
			}System.out.println();
		}
		/*
		 * 			1234
		 * 			1234
		 * 			1234
		 */
	System.out.println(" Pattern 4 ");
	
	for(i=1;i<=4;i++)
	{
		for(j=1;j<=4;j++)
		{
			System.out.print(j);
		}System.out.println();
	}
 	/*
	 * 		1 2 3 4
	 * 		2 3 4 1
	 * 		3 4 1 2
	 * 		4 1 2 3
	 * 
	 */
	for(i=1;i<=4;i++)
	{
		for(j=1;j<=4;j++)
		{
			int p=i+j-1;
			if(p>4)
				System.out.print(k-4 +" ");
			else
				System.out.println(k+" ");
		}
		
			System.out.println();
	
	}
	
	
	}
	
}
