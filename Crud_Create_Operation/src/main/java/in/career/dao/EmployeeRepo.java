package in.career.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import in.career.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {

}
