package ClassTopic;

public class ThisExample {

	int x;
	int y;

	ThisExample(int x,int y)
	{
		this.x=x;
		this.y=y;
		System.out.println("before passing through method ");
		System.out.println(" x "+this.x +" y "+ this.y);
		 addTwo(this);
	        System.out.println("After passing this to addTwo() method:");
	        System.out.println("x = " + this.x + ", y = " + this.y);
	}
	
	void addTwo(ThisExample O)
	{
		O.x=+2;
		O.y=+2;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisExample A=new ThisExample(7,8);
	}

}
