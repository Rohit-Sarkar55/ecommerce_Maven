<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="com.deloitte.java.model.Product" %>

<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Product List</title>
    <style>
        /* Basic styling for the product cards grid */
        .product-cards-container {
            display: grid;
            grid-template-columns: repeat(auto-fill, minmax(250px, 1fr));
            gap: 20px;
        }

        .product-card {
            border: 1px solid #ddd;
            border-radius: 8px;
            overflow: hidden;
            transition: transform 0.3s;
        }

        .product-card:hover {
            transform: scale(1.05);
        }

        .product-image {
            width: 100%;
            height: 150px;
            object-fit: cover;
        }

        .product-details {
            padding: 15px;
        }

        .product-title {
            font-size: 18px;
            font-weight: bold;
            margin-bottom: 8px;
        }

        .product-price {
            font-size: 16px;
            color: #e44d26;
        }

        .product-description {
            font-size: 14px;
            margin-top: 8px;
        }

        .add-to-cart-button {
            display: block;
            width: 100%;
            padding: 10px;
            background-color: #4CAF50;
            color: white;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            font-size: 16px;
            text-align: center;
        }
    </style>
</head>
<body>

    <h2>Product List</h2>
	
    <div class="product-cards-container">
        <c:forEach var="product" items="${sessionScope.cartItems}">
        	<form action="CartServlet" method="post" >
            <div class="product-card">
                <img src="${product.getFileData()}" alt="${product.getName()}" class="product-image">
                <div class="product-details">
                    <div class="product-title">${product.getName()}</div>
                    <input type="text" type="hidden" name ="pid" value="${product.getId()}">
                    <div name="product-price" class="product-price">${product.getPrice()}</div>
                    <input type="number" type="hidden" name ="p-price" value="${product.getPrice()}">
                    <div name="product-description" class="product-description">${product.getDescription()}</div>
                    <button class="add-to-cart-button">Check Out</button>
                    
                </div>
            </div>
            </form>
        </c:forEach>
    </div>
	
</body>
</html>
