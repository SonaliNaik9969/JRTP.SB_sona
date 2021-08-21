package in.career.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.career.entity.Users;

public interface UsersRepo extends JpaRepository<Users, Integer> {

	Users deleteByDOB(Object object);

}
