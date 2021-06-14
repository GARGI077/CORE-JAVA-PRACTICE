package ClassTopic;

public class ConsMain {
	private int x;
	
	ConsMain()
	{
		System.out.println(" Constructore called ");
		x=5;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConsMain obj=new ConsMain();
		System.out.println("VALUE OF X "+obj.x);
	}

}
