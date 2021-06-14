package ClassTopic;

public class ThisTest {

	public  int instVar;
	ThisTest(int instVar)
	{
		this.instVar=instVar;
		System.out.println("this refrence "+this.instVar);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	ThisTest T=new ThisTest(7);
	System.out.println("object refrence"+T.instVar);

	}

}
