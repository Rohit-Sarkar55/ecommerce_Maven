<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <style>
        body {
            margin: 0;
            font-family: Arial, sans-serif;
        }

        .navbar {
            background-color: #333;
            overflow: hidden;
        }

        .navbar a {
            float: left;
            display: block;
            color: #f2f2f2;
            text-align: center;
            padding: 14px 16px;
            text-decoration: none;
        }

        .navbar a:hover {
            background-color: #ddd;
            color: black;
        }

        .logout {
            float: right;
        }
    </style>
</head>
<body>
    <div class="navbar">
        <a href="">Home</a>
        <a href="addProductForm.jsp">Add Products</a>
        <a href="">View Products</a>
        <a href="">View All Orders</a>
        <a href="">View Pending Orders</a>
        <a href="">View Delivered Orders</a>
        <a href="">View Customers</a>
        <a href="" class="logout">Logout</a>
    </div>
</body>
</html>
