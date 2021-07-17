package basic.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class StudentDao {
	
	public void SaveStudent(Student student) 
	{
		try {
			Connection con = DBConnection.createConnection();
			String sql = "insert into Student(id,first_name,last_name,email) values (?,?,?,?)";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(1, student.getId());
			stmt.setString(2, student.getFirst_name());
			stmt.setString(3, student.getLast_name());
			stmt.setString(4, student.getEmail());
			stmt.executeUpdate();
			System.out.println("Data inserted successfully");
		} 
		catch (Exception e) 
		{
			System.out.println("Data inserted failed" +e.getMessage());
		}
		
			
	}
	
	public void updateStudent(Student student) 
	{
		try 
		{
			Connection con = DBConnection.createConnection();
			String sql = "update  student  set email=? where id=?";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, student.getEmail());
			stmt.setInt(2, student.getId());
			stmt.executeUpdate();
			System.out.println("Data Updated Successfully");
		} 
		catch (Exception e) 
		{
			System.out.println("Data Update Failed" + e.getMessage());
		}
		
	}
	
	public void deleteStudent(Integer id) 
	{
		try 
		{
			Connection con = DBConnection.createConnection();
			String sql = "delete  from student  where id=?";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(1, id);
			stmt.executeUpdate();
			System.out.println("Data Deleted Successfully");
		} 
		catch (Exception e) 
		{
			System.out.println("Data Deletion failed" + e.getMessage());
		}
	}
	
	public void getAllStudent() 
	{
		try 
		{
			Connection con = DBConnection.createConnection();
			String sql = "select * from student";
			PreparedStatement stmt = con.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) 
			{
				System.out.println(rs.getString("id") + " " + rs.getString("first_name") + "  " + rs.getString("last_name")
						+ "  " + rs.getString("email"));
			}
		} 
		catch (Exception e) 
		{
			System.out.println("Unble to retrive data" + e.getMessage());
		}

	}

}
