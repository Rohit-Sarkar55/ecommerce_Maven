package com.deloitte.java.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.deloitte.java.model.DaoCustomer;

/**
 * Servlet implementation class CartServlet
 */
public class CartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Cart Servlet");
		
		HttpSession session = request.getSession();
		int pid = Integer.parseInt((String)request.getParameter("pid"));
		String price = (String)request.getParameter("p-price");
		String desc = (String)request.getParameter("pdesc");
		System.out.println(pid + " "+ price + " " + desc);
		
		int cid = (int) session.getAttribute("current_cid");
		System.out.println(cid);
		int res = DaoCustomer.addToCart(cid, pid);
		System.out.println(res);
		response.sendRedirect("index.jsp");
	}

}
