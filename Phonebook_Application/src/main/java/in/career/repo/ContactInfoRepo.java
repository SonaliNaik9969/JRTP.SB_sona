package in.career.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.career.entity.ContactInfo;

public interface ContactInfoRepo extends JpaRepository<ContactInfo, Integer>{

}
