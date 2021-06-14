package ClassTopic;

import java.util.Scanner;

public class SingleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//AddSub x=new AddSub();
		//Scanner s=new Scanner(System.in);
		
		
		//x.a=s.nextInt();
		//x.b=s.nextInt();
		
	 
	
	}

}

class Add
{
	int a,b,result;
	
	public void sum()
	{
		result=a+b;
	}
class AddSub extends Add
{
	public void sub()
	{
		result=a-b;
		
	}
}

}