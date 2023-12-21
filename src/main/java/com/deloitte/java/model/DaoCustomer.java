package com.deloitte.java.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.deloitte.java.DBConnection.DBConnection;

public class DaoCustomer {
	public static Connection conn;
	private static PreparedStatement prs;
	
	public static int addCustomer(Customer c) {
		int status = -1;
		
		conn = DBConnection.getConnection();
		try {
			prs = conn.prepareStatement("insert into Customers (name, email , password , phone , gender"
					+ " , address , pincode) values(?,?,?,?,?,?,?)");
			
			prs.setString(1 , c.getName());
			prs.setString(2 , c.getEmail());
			prs.setString(3 , c.getPassword());
			prs.setString(4 , c.getPhoneNo());
			prs.setString(5 , c.getGender());
			prs.setString(6, c.getAddress());
			prs.setInt(7, c.getPincode());
			
			
			status = prs.executeUpdate();
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		return status;
	}
	
	public static int findCustomer(String email , String password) {
		int id = -1;
		
		conn = DBConnection.getConnection();
		try {
			prs = conn.prepareStatement("select customerId from customers where email = ? and password = ?");
			
			prs.setString(1 , email);
			prs.setString(2, password);
			
			ResultSet rs = prs.executeQuery();
			if(rs.next()) {
				id = rs.getInt(1);
			}
			
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		return id;
	}
	
	
	public static List<Product>getProductList(){
		List<Product>list = new ArrayList<>(); 
		conn = DBConnection.getConnection();
		try {
			prs = conn.prepareStatement("select * from products");
			
			
			ResultSet rs = prs.executeQuery();
			while(rs.next()) {
				int pid = rs.getInt(1);
				String name = rs.getString(2);
				double price = rs.getDouble(3);
				String desc = rs.getString(4);
				double mrp = rs.getDouble(5);
				String status = rs.getString(6);
				String category = rs.getString(7);
				String path = rs.getString(8);
				
				list.add(new Product(pid, name, price, desc, mrp, status, category, path));
			}
			
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		return list;
	}
	
	public static int addToCart(int cid , int pid) {
		conn = DBConnection.getConnection();
		int res = -1;
		try {
			prs = conn.prepareStatement("insert into shopping_cart (customerId ,product_id ) values(?,?)");
			prs.setInt(1 , cid);
			prs.setInt(2 , pid);
			res = prs.executeUpdate();
			System.out.println("Item added to the cart Successfully");
		
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return res;
	}
	
	public static List<Product> showMyCart(int cid) {
		conn = DBConnection.getConnection();
		List<Product> list = new ArrayList<Product>();
		try {
			prs = conn.prepareStatement("select products.id , products.name,products.price,\r\n"
					+ "products.description,products.mrp_price, products.status, \r\n"
					+ "products.category,products.filename from shopping_cart join customers \r\n"
					+ "on ? = shopping_cart.customerId \r\n"
					+ "join products on products.id = shopping_cart.product_id");
			
			prs.setInt(1 , cid);
			
			ResultSet rs = prs.executeQuery();
			while(rs.next()) {
				int pid = rs.getInt(1);
				String name = rs.getString(2);
				double price = rs.getDouble(3);
				String desc = rs.getString(4);
				double mrp = rs.getDouble(5);
				String status = rs.getString(6);
				String category = rs.getString(7);
				String fpath = rs.getString(8);
				
				list.add(new Product(pid, name, price, desc, mrp, status, category, fpath));
			}
		
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return list;
	}
}
