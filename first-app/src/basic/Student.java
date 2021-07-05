package basic;

public class Student {

	public String firstName;
	public String lastName;
	public String email;
	public int age;
	

public void show()
{
	System.out.println("First Name:  "+firstName);
	System.out.println("Last Name:  "+lastName);
	System.out.println("Email:  "+email);
	System.out.println("Age:  "+age);
}
public static void main(String[] args) {
	Student s1= new Student();
	s1.firstName="Sonali";
	s1.lastName="Naik";
	s1.email="sonalinaik1865@gmail.com";
	s1.age=23;
	s1.show();

}
}