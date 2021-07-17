package basic.dao;

public class StudentDaoTest {
	
	public static void main(String[] args) {

		StudentDao studentDao=new StudentDao();

		Student student=new Student(1, "Adesh", "W", "adeshw@gmail.com");

		studentDao.getAllStudent();
	}

}
