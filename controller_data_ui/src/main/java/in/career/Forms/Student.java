package in.career.Forms;

public class Student {
	private String Name;
	private String Address;
	private String Email;
	private String Contact;
	private String DOB;
	private String Education;
	
	public Student()
	{
		
	}
	
	
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getAddress() {
		return Address;
	}


	public void setAddress(String address) {
		Address = address;
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


	public String getDOB() {
		return DOB;
	}


	public void setDOB(String dOB) {
		DOB = dOB;
	}


	public String getEducation() {
		return Education;
	}


	public void setEducation(String education) {
		Education = education;
	}
	

	


	@Override
	public String toString() {
		return "Student [Name=" + Name + ", Address=" + Address + ", Email="+ Email +", Contact="+ Contact +", DOB="+ DOB +", Education="+ Education +"]";
	
	}
	
	

}
