package in.career;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import in.career.entity.Student1;
import in.career.repo.StudentRepo;

@SpringBootTest
class SoftnHardDeleteApplicationTests {
	
	@Autowired
	private StudentRepo studrepo;

	@Test
	public void testSavestudent()
	{
		Student1 s1 = new Student1("Tejal", "Tejal123@gmail.com", "VWX");
		//s1.setId(3L);
		Student1 save = studrepo.save(s1);
		System.out.println("Data saved successfully");
	}
	@Test
	public void testGetAllStudentActiveTrue()
	{
		List<Student1> findByActiveTrue = studrepo.findByActiveTrue();
		System.out.println(findByActiveTrue);
	}
	@Test
	public void testSoftDelete()
	{
		Long id=4L;
		Student1 stud1 = studrepo.findById(id).get();
		stud1.setActive(false);
		System.out.println(stud1);
	}
	@Test
	public void testHardDelete()
	{
		Long id=3L;
		studrepo.deleteById(id);
	}
}
