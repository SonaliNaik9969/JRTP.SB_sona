package in.career.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.career.entity.Employees;

public interface EmployeesRepo extends JpaRepository<Employees, Long>{

}
