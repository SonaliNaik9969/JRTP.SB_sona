package in.career;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Example;

import in.career.dao.EmployeesRepo;

import in.career.entity.Employees;



@SpringBootTest
class CustomQueryApplicationTests {
	
	@Autowired
	EmployeesRepo emrepo;
	
	@Test
	public void testSaveEmp()
	{
		Employees emp = new Employees(4, "Divesh", "divesh432@gmail.com");
		emrepo.save(emp);
		System.out.println("Data saved successfully");
	}

	@Test
	public void testCustomQuerygetEmployee()
	{
		List<Employees> getallEmployee = emrepo.findAll();
		System.out.println(getallEmployee);
	}
	
	

}
