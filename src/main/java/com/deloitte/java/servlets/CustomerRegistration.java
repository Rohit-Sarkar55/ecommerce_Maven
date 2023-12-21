package com.deloitte.java.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.deloitte.java.model.Customer;
import com.deloitte.java.model.DaoCustomer;

/**
 * Servlet implementation class CustomerRegistration
 */
public class CustomerRegistration extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		String name = (String)request.getParameter("name");
		String email = (String)request.getParameter("email");
		String password = (String)request.getParameter("password");
		String phone = (String)request.getParameter("phone");
		String gender = (String)request.getParameter("gender");
		String address = (String)request.getParameter("address");
		int pincode =Integer.parseInt((String)request.getParameter("pincode"));
		
		Customer c = new Customer(name, email, password, phone, gender, address, pincode);
		System.out.println(c);
		int status = DaoCustomer.addCustomer(c);
		if(status > 0) {
			System.out.println("New User Added Successfully");
		}
		
	}

}
