package in.career.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import in.career.entity.Student1;

public interface StudentRepo extends JpaRepository<Student1, Long> {
	
	List<Student1> findByActiveTrue();
	

}
