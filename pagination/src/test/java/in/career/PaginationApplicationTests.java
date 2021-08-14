package in.career;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import in.career.entity.Employees;
import in.career.repo.EmployeesRepo;

@SpringBootTest
class PaginationApplicationTests {
	@Autowired
	private EmployeesRepo emRepo;

	@Test
	public void saveEmployee()
	{
		Employees emp = new Employees(106L, "Pratiksha", "pratu546@gmail.com", "DEF", 30000);
		emRepo.save(emp);
		System.out.println("Data saved successfully!!!");
	}
	@Test
	public void testPageableEmployee()
	{
		int pageNo=2;
		int pageSize=3;
		
		PageRequest pagerequest = PageRequest.of(pageNo, pageSize);
		Page<Employees> findAll = emRepo.findAll(pagerequest);
		List<Employees> content = findAll.getContent();
		System.out.println(findAll);
	}

}
