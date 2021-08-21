package in.career.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.career.entity.Contact_Info;

public interface ContactInfo_Repo extends JpaRepository<Contact_Info, Integer>{

}
