package in.career.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Users {
	@Id
	private Integer ID;
	private String FirstName;
	private String LastName;
	private String Email;
	private String Contact;
	private Integer DOB;
	private String Gender;
	private String Conuntry;
	private String State;
	private String City;
	
	public Users() {
		// TODO Auto-generated constructor stub
	}

	public Users(Integer iD, String firstName, String lastName, String email, String contact, Integer dOB, String gender,
			String conuntry, String state, String city) {
		super();
		ID = iD;
		FirstName = firstName;
		LastName = lastName;
		Email = email;
		Contact = contact;
		DOB = dOB;
		Gender = gender;
		Conuntry = conuntry;
		State = state;
		City = city;
	}

	public Integer getID() {
		return ID;
	}

	public void setID(Integer iD) {
		ID = iD;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getContact() {
		return Contact;
	}

	public void setContact(String contact) {
		Contact = contact;
	}

	public Integer getDOB() {
		return DOB;
	}

	public void setDOB(Integer dOB) {
		DOB = dOB;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public String getConuntry() {
		return Conuntry;
	}

	public void setConuntry(String conuntry) {
		Conuntry = conuntry;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	@Override
	public String toString() {
		return "Users [ID=" + ID + ", FirstName=" + FirstName + ", LastName=" + LastName + ", Email=" + Email
				+ ", Contact=" + Contact + ", DOB=" + DOB + ", Gender=" + Gender + ", Conuntry=" + Conuntry + ", State="
				+ State + ", City=" + City + "]";
	}
}


	