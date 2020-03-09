package sql;


import java.io.IOException;
import  java.sql.Connection;		
import  java.sql.Statement;		
import  java.sql.ResultSet;		
import  java.sql.DriverManager;		
import  java.sql.SQLException;


public class database {
	public static void main(String[] args) throws IOException, ClassNotFoundException, 

	SQLException { 	
		String dburl = "jdbc:mysql://localhost:3306/emp"; 
		String username = "root";
		String password = "root"; 
		String query = "Select * from employee"; 
		Class.forName("com.mysql.jdbc.Driver"); 
		Connection con= DriverManager.getConnection(dburl, username, password); 
		Statement stmt = con.createStatement(); 
		ResultSet rs = stmt.executeQuery(query); 
		while( rs.next())
		{ 
		String name = rs.getString("name"); 
		String rollno = rs.getString("roll"); 
		String sal= rs.getString("sal"); 
		System.out.println(name); 
		System.out.println(rollno); 
		System.out.println(sal); 
		 
}con.close(); 

	}
}
