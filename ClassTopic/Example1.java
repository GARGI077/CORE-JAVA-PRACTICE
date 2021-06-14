package ClassTopic;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Abc obj=new Abc();
		Abc ob=new Abc(7);

	}

}


class Abc
{
	//constructor overloading 
	
	public Abc()//default constructor
	{
		System.out.println("THE Abc CONSTRUCTOR");
	}
	
	public Abc(int i)//parameterized
	{
		System.out.println("V"+i);
	}

}