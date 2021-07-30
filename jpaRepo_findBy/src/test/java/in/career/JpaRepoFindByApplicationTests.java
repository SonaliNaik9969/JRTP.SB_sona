package in.career;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Example;

import in.career.dao.EmployeeRepo;
import in.career.entity.Employee;


@SpringBootTest
class JpaRepoFindByApplicationTests {

	@Autowired
	EmployeeRepo empRepo;
	@Test
	public void testSave()
	{
		Employee e1 = new Employee(4L, "Mayuri", "MayuriW@gmail.com", "2222222222", "LMN", 40000);
		empRepo.save(e1);
		System.out.println("Data saved successfully");
	}
	@Test
	public void testfindByEmail()
	{
		Employee emp = empRepo.findByEmail("AadeshW@gmail.com");
		System.out.println("FindByEmail Method "+emp);
	}
	
	@Test
	public void testfindByMobile()
	{
		Employee em = empRepo.findByMobile("2222222222");
		System.out.println("FindByMobile Method "+em);
	}
	@Test
	public void testfindByDepartment()
	{
		List<Employee> DeptWiseEmployeeList = empRepo.findByDepartment("PQR");
		System.out.println("FindByDept Method "+DeptWiseEmployeeList);
	}

}
