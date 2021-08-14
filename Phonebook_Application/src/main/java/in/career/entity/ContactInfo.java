package in.career.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ContactInfo {
	@Id
	private Integer Contact_ID;
	private String Contact_Name;
	private String Contact_Email;
	private String Contact_No;
	
	public ContactInfo() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "ContactInfo [Contact_ID=" + Contact_ID + ", Contact_Name=" + Contact_Name + ", Contact_Email="
				+ Contact_Email + ", Contact_No=" + Contact_No + "]";
	}

	public ContactInfo(Integer contact_ID, String contact_Name, String contact_Email, String contact_No) {
		super();
		Contact_ID = contact_ID;
		Contact_Name = contact_Name;
		Contact_Email = contact_Email;
		Contact_No = contact_No;
	}

	public Integer getContact_ID() {
		return Contact_ID;
	}

	public void setContact_ID(Integer contact_ID) {
		Contact_ID = contact_ID;
	}

	public String getContact_Name() {
		return Contact_Name;
	}

	public void setContact_Name(String contact_Name) {
		Contact_Name = contact_Name;
	}

	public String getContact_Email() {
		return Contact_Email;
	}

	public void setContact_Email(String contact_Email) {
		Contact_Email = contact_Email;
	}

	public String getContact_No() {
		return Contact_No;
	}

	public void setContact_No(String contact_No) {
		Contact_No = contact_No;
	}
	
	
	
	

}
