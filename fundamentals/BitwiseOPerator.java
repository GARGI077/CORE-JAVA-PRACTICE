//Bitwise -> AND & , OR |

package completejava;

public class BitwiseOPerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=25;//11001
		int b=15;//01111
		
		/* & 1&1->1
		 *   1&0->0
		 *   0&1->0
		 * a=11001
		 *     &
		 * b=01111
		   
		 a&b=01001
		 a&b=9
		 *
		 */  
		
		
		
		int c=a & b;
		System.out.println(c);
		
		int d=a|b;
		System.out.println(d);
 
		
		
	}

}
