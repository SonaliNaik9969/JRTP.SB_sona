package in.career.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employees {
	@Id 
	private Integer id;
	private String name;
	private String email;
	
	public Employees() {
		// TODO Auto-generated constructor stub
	}
	
	

	@Override
	public String toString() {
		return "Employees [id=" + id + ", name=" + name + ", email=" + email + "]";
	}



	public Employees(Integer id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	

}
