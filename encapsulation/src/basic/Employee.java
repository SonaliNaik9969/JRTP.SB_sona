package basic;

public class Employee {
	
	private String empId;
	private String empName;
	private String empEmail;
	private int salary;
	
	public void setEmpId(String e)
	{
		empId=e;
	}
	
	public void setEmpName(String m)
	{
		empName=m;
	}
	
	public void setEmpEmail(String e)
	{
		empEmail=e;
	}
	
	public void setSalary(int s)
	{
		salary=s;
	}
	
	public void display()
	{
		System.out.println("EmpId :: "+empId);
		System.out.println("EmpName :: "+empName);
		System.out.println("EmpEmail :: "+empEmail);
		System.out.println("salary :: "+salary);
		
	}

}
