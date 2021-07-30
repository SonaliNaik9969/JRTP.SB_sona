package in.career;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Example;

import in.career.dao.EmpRepo;
import in.career.entity.Employee1;

@SpringBootTest
class FilterTestApplicationTests {
	
	@Autowired
	private EmpRepo emrepo;

	@Test
	public void testFilteredEmp()
	{
		Employee1 em = new Employee1();
		em.setEmail("Sonalin@gmail.com");
		Example<Employee1> exmapleEmp = Example.of(em);
		List<Employee1> findall = emrepo.findAll(exmapleEmp);
		System.out.println(findall);
	}
	
	
}
