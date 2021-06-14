//bitwise Left Shift << ::Left shift operator append assigned no of ZERO
//bitwise Right shift>> ::Right Shift operator shifts 
// 

package completejava;

public class Shiftoperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=8;// 1 0 0 0
		System.out.println("Original value "+a);
		int b=a<<2; // 1000 0 0(that is 2 zeros are appended )
		
		System.out.println("Left Shift by 2 is "+b);
		int x=25;
		int c=x>>2;
		System.out.println("Right Shift of" + x +" is  "+c);
	}

}
