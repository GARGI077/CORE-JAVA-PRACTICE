package InheritanceConcept;

 abstract class Animal {
	
	private String name;
	
	private String breed;
	
	public String getName()
	{
			return name;
		}
	
	public void setName(String name)
	{
			this.name=name;
		}
	
	
	public void setBreed(String breed)
	{
		this.breed=breed;
	}
	
	public String getBreed()
	{
		return breed;
	}
	
	
	public void run() 
	{
		System.out.println("I run");
		
		}
	 abstract void eat();
	
	

}
