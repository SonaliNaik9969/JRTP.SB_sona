package in.career.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import in.career.entity.Employee1;

public interface EmpRepo extends JpaRepository<Employee1, Long> {
	
	

}
