package in.career.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.career.dao.EmployeeRepo;
import in.career.entity.Employee;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepo empRepo;
	
	public Employee saveEmployee(Employee emp)
	{
		Employee em = empRepo.save(emp);
		return em;
	}

	public List<Employee> getAllEmployees() {
		List<Employee> allEmployee = empRepo.findAll();
		return allEmployee;
	}

}
