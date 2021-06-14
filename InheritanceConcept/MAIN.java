package InheritanceConcept;

public class MAIN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog d=new Dog();
		d.bark();
		d.setName(" BRUNO ");		
		d.setBreed(" DESI labradour ");
		d.setColor(" Golden Brown ");
		System.out.println("My name is"+d.getName());
		System.out.println("I am a"+d.getBreed());
		System.out.println("my color"+d.getColor());
		d.run();
		
		System.out.println("\n");
		
		Cat c=new Cat();
		c.meow();
		c.setName(" Piko ");
		c.setBreed(" Persian ");
		c.setPattern("black strips");
		System.out.println("My name"+c.getName());
		System.out.println("I am a"+c.getBreed());
		System.out.println("My pattern is "+c.getPattern());
		
		System.out.println("\nupcasting example");
		
		
		Animal a=new Dog(); // upcasting
		a.run();
		
		/*a method where parent class can cast their child class */
		
		
	}

}
