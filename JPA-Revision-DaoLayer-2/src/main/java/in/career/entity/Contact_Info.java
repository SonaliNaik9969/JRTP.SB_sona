package in.career.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Contact_Info {
	@Id
	private Integer id;
	private String name;
	private String email;
	private String contact;

	public Contact_Info() {
		// TODO Auto-generated constructor stub
	}

	public Contact_Info(Integer id, String name, String email, String contact) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.contact = contact;
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

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	@Override
	public String toString() {
		return "Contact_Info [id=" + id + ", name=" + name + ", email=" + email + ", contact=" + contact + "]";
	}
	
	
}
