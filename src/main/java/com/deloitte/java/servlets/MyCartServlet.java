package com.deloitte.java.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.deloitte.java.model.DaoCustomer;
import com.deloitte.java.model.Product;

/**
 * Servlet implementation class MyCartServlet
 */
public class MyCartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		HttpSession session = request.getSession();
		int cid =(int)session.getAttribute("current_cid");
		
		List<Product> list = DaoCustomer.showMyCart(cid);
		System.out.println(list);
		session.setAttribute("cartItems", list);
		response.sendRedirect("showCart.jsp");
	}

}
