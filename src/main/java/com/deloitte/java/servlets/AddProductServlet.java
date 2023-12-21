package com.deloitte.java.servlets;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import com.deloitte.java.DBConnection.DBConnection;
import com.deloitte.java.model.DaoAdmin;
import com.deloitte.java.model.Product;



/**
 * Servlet implementation class AddProductServlet
 */
@WebServlet("/AddProductServlet")
@MultipartConfig
public class AddProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = (String)request.getParameter("name");
		String desc = (String)request.getParameter("description");
		String status = (String)request.getParameter("status");
		String category = (String)request.getParameter("category");
		double price = Double.parseDouble((String)request.getParameter("price"));
		double mrp = Double.parseDouble((String)request.getParameter("mrp"));
		
		
		System.out.println(category);
		Part part = request.getPart("file");
		String fileName = part.getSubmittedFileName();
		InputStream fileContent = part.getInputStream();
		
		String uploadPath = "C:\\Users\\rohisarkar\\eclipse-workspace\\shopping-cart\\src\\main\\webapp\\Images";//+File.separator+"uploads";
		Path uploadDir = Path.of(uploadPath);
		Files.createDirectories(uploadDir);
		
		Path filePath = uploadDir.resolve(fileName);
		Files.copy(fileContent, filePath , StandardCopyOption.REPLACE_EXISTING);
		
		fileContent.close();
		deleteTemporaryFile(part);
		
//		System.out.println(filePath.toString() + "\n\n\n\n" + uploadPath + "\n\n\n" + getServletContext().getRealPath("")) ;
//		System.out.println("Here");
//		String fileData = uploadPath+File.separator+fileName;
		
		Product p = new Product(name, price, desc, price, status, category, "Images/"+fileName);
		System.out.println(p);
		
		int result = DaoAdmin.addProduct(p);
		System.out.println(result );
		
		response.sendRedirect("adminView.jsp");
	}
	private void deleteTemporaryFile(Part filePart) {
        try {
            // Get the temporary file path
            String tempFilePath = filePart.getSubmittedFileName();

            // Check if the temporary file exists and delete it
            if (tempFilePath != null && Files.exists(Path.of(tempFilePath))) {
                Files.delete(Path.of(tempFilePath));
            }
        } catch (IOException e) {
            // Handle the exception or log it
            e.printStackTrace();
        }

	}
	
}
