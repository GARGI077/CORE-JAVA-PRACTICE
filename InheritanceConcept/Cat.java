package InheritanceConcept;

 class Cat  extends Animal {
	
	private String pattern;
	
	public void setPattern(String pattern)
	{
		this.pattern=pattern;
	}
	
	public String getPattern() 
	{
		return pattern;
	}
	
	public void meow()
	{
		System.out.println(" MEOW!! MEOW!! ");
	}
	
	public void run() {
		System.out.println("I am cat I am very lazy I don't run");
	}

	public void eat()
	{
		System.out.println("I eat fish ");
	}
}
