package InheritanceConcept;

 class Dog extends Animal {
	
	private String color;
	
	public void setColor(String color)
	{
		this.color=color;
	}
	
	public String getColor()
	{
		return color;
	}
	
	
public void bark()
{
	System.out.println(" whoo!! whoo!!");
}

public void run()
{
	System.out.println(" I am a Dog and I run very fast ");
}


public void eat() {
	System.out.println("i eat Chicken");
}

}
