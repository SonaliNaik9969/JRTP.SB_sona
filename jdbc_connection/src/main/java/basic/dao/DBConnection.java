package basic.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

	public void createConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String uri = "jdbc:mysql://localhost:3306/test";
			String userName = "root";
			String password = "Sonanaik@1865";

			Connection con;

			con = DriverManager.getConnection(uri, userName, password);
			System.out.println("Connection Successful!!");
		} catch (Exception e) {
			System.out.println("Connection Failed!!" + e.getMessage());
			System.out.println(e);
		}
	}

}
