package in.career;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import in.career.entity.Contact_Info;
import in.career.repo.ContactInfo_Repo;

@SpringBootTest
class JpaRevisionDaoLayer2ApplicationTests {

	@Autowired
	private ContactInfo_Repo ConRepo;
	@Test
	public void testSaveContact()
	{
		Contact_Info c1 = new Contact_Info(105, "Amey", "Amey5678@gmail.com", "9087654321");
		ConRepo.save(c1);
		System.out.println("Contact Saved Successfully");
	}
	@Test
	public void testContactFindByID()
	{
		Optional<Contact_Info> con = ConRepo.findById(103);
		System.out.println("FindByID Method : "+con);
	}
	@Test
	public void testContactsFindAll()
	{
		List<Contact_Info> con1 = ConRepo.findAll();
		System.out.println("FindAll Method : "+con1);
	}
	@Test
	public void testContactDeleteByID()
	{
		Integer ID=102;
		ConRepo.deleteById(ID);
		System.out.println("Contact Deleted Successfully");
	}

}
