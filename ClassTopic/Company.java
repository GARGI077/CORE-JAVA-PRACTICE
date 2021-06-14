package ClassTopic;

public class Company {
	
	String domainname;
	public Company()
	{
		this.domainname="Default";
	}
	
	public Company(String domainname)
	{
		this.domainname=domainname;
	}
	
	public void getname()
	{
		System.out.println(this.domainname);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Company defaultobj=new Company();
		Company programobj=new Company("GARGI SINGH CHAUHAN");
		
		defaultobj.getname();
		programobj.getname();
		
	}

}
