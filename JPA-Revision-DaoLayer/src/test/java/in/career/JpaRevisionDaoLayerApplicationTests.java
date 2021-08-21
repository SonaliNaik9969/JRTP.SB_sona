package in.career;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import in.career.Repo.UsersRepo;
import in.career.entity.Users;

@SpringBootTest
class JpaRevisionDaoLayerApplicationTests {

	@Autowired
	private UsersRepo uRepo;
	@Test
	public void testSaveUsers()
	{
		Users u1 = new Users(6, "Bhumika", "Mhatre", "bhoomi789@gmail.com", "7685940321", 1999, "Male", "India", "Maharashtra", "Mumbai");
		uRepo.save(u1);
		System.out.println("Users Data Saved Successfully");
	}
	@Test
	public void testUsersFindByID()
	{
		Optional<Users> user = uRepo.findById(3);
		System.out.println("FindByID Method : "+user);
	}
	@Test
	public void testUsersFindAll()
	{
		List<Users> user1 = uRepo.findAll();
		System.out.println("FindAll Method : "+user1);
	}
	@Test
	public void testDeleteByID()
	{
		Integer ID=4;
		uRepo.deleteById(ID);
		System.out.println("Users Data Deleted Successfully");
	}
}
