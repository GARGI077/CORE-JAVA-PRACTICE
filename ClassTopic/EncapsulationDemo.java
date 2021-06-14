package ClassTopic;

public class EncapsulationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Emp e=new Emp();
		e.setEmpId(7);
		e.setEmpName("GARGI");
		System.out.println(e.getEmpName());
	}

}

class Emp
{
	private int empId;
	private String empName;
	
	public void setEmpId(int empId)
	{
		this.empId=empId; 
		
	}
	
	public String getEmpName()
	{
		return (empName);
	}
	
	public void setEmpName(String empName)
	{
		 this.empName=empName; 
	}

}
