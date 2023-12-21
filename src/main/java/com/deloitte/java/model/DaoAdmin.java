package com.deloitte.java.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.deloitte.java.DBConnection.DBConnection;

public class DaoAdmin {
	public static Connection conn ;
	private static PreparedStatement prs;
	
	public static int findAdmin(String email , String password) {
		int id = -1;
		conn = DBConnection.getConnection();
		try {
			prs = conn.prepareStatement("select admin_id from Admin where email=? and password=?");
			prs.setString(1 , email);
			prs.setString(2 , password);
			
			ResultSet rs = prs.executeQuery();
			
			if(rs.next()) {
				id = rs.getInt(1);
			}
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		return id;
	}
	
	public static int addProduct(Product p) {
		int status= -1;
		conn = DBConnection.getConnection();
		try {
			prs = conn.prepareStatement("insert into products (name , price , description , mrp_price , status , category , filename ) values (?,?,?,?,?,?,?)");
			prs.setString(1 , p.getName());
			prs.setDouble(2, p.getPrice());
			prs.setString(3, p.getDescription());
			prs.setDouble(4, p.getMrpPrice());
			prs.setString(5 , p.getStatus());
			prs.setString(6 , p.getCategory());
			prs.setString(7 , p.getFileData());
			
			status = prs.executeUpdate();
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		return status;
	}
}
