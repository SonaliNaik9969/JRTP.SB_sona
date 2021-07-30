package in.career.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import in.career.entity.Employees;

public interface EmployeesRepo extends JpaRepository<Employees, Integer> {
	
	
	
	@Query("from Employees")
	List <Employees> getallEmployee();
	
	

}
