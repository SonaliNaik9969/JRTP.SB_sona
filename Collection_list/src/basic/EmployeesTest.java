package basic;

import java.util.ArrayList;
import java.util.List;

public class EmployeesTest {
	
	public static void main(String[] args) {
		
		Employees e1 = new Employees(1L, "Sonali", 75000);
		Employees e2 = new Employees(2L, "Sandesh", 80000);
		Employees e3 = new Employees(3L, "Aadesh", 74000);
		Employees e4 = new Employees(4L, "Mayuri", 60000);
		Employees e5 = new Employees(5L, "Gautami", 70000);
		
		List<Employees> allEmp = new ArrayList<>();
		allEmp.add(e1);
		allEmp.add(e2);
		allEmp.add(e3);
		allEmp.add(e4);
		allEmp.add(e5);
		
		System.out.println("All Employees : "+allEmp);
		
		List<Employees> HSalary = new ArrayList<>();
		List<Employees> LSalary =new ArrayList<>();
		
		for(Employees em : allEmp)
		{
			if(em.getSalary() > 72000)
			{
				HSalary.add(em);
			}
			else
			{
				LSalary.add(em);
			}
		}
		
		System.out.println("HSalary Employees : "+HSalary);
		System.out.println("LSalary Employees : "+LSalary);
		
	}

}
