package basic.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection 
{

	public static Connection createConnection() 
	{
		
		Connection con = null;
		try 
		{
				
			Class.forName("com.mysql.cj.jdbc.Driver");
			String uri = "jdbc:mysql://localhost:3306/test";
			String username = "root";
			String password = "Sonanaik@1865";
			con = DriverManager.getConnection(uri, username, password);
			System.out.println("Connection success!!");
			return con;
		} 
		catch (Exception e) 
		{
			System.out.println("Connection Failed !!" + e.getMessage());
			System.out.println(e);
			return con;
		}
		
	}

}
