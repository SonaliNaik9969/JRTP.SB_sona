package in.career;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import in.career.dao.TeacherDao;
import in.career.entity.Teacher;

@SpringBootTest
class CrudRepoJpaApplicationTests {

	@Autowired
	private TeacherDao td;
	@Test
	public void saveTeacher()
	{
		Teacher t1 = new Teacher(2L, "Sonali", "sonanaik@gmail.com");
		td.save(t1);
		System.out.println("Saved successfully!!!");
	}
	@Test
	public void showStudent()
	{
		Optional<Teacher> teacher = td.findById(3L);
		System.out.println(teacher.get());
	}
	
	
	@Test
	public void delStudent()
	{
		td.deleteById(4L);
		
	}
	@Test
	public void showAllStudent()
	{
		Iterable<Teacher> allstudent = td.findAll();
		System.out.println("List of All Students "+allstudent);
	}
	
}
