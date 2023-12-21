package com.deloitte.java.DBConnection;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DBConnection {
private static Connection conn = null;
	
	static {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce", "root", "_MySql_@Rohit_1234");
			System.out.println("Successfully Connected to DB");
		}
		catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static Connection getConnection() {
		return conn;
	}
}
