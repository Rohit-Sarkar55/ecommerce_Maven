package com.deloitte.java.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.deloitte.java.model.DaoCustomer;

/**
 * Servlet implementation class CustomerLogin
 */
public class CustomerLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session  = request.getSession();
		String email = (String)request.getParameter("email");
		String password = (String)request.getParameter("password");
		
		int cid = DaoCustomer.findCustomer(email, password);
		if(cid > 0) {
			session.setAttribute("current_cid", cid);
			System.out.println("Customer Login " + cid);
			response.sendRedirect("index.jsp");
		}
		
	}

}
