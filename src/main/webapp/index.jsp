<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>My E-Commerce Website</title>
    <style>
        /* Add your custom styles for the navbar */
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
        }

        header {
            background-color: #333;
            color: #fff;
            padding: 10px 0;
            text-align: center;
        }

        nav {
            background-color: #007BFF;
            overflow: hidden;
        }

        nav a {
            float: left;
            display: block;
            color: white;
            text-align: center;
            padding: 14px 16px;
            text-decoration: none;
        }

        nav a:hover {
            background-color: #0056b3;
        }

        .cart-container {
            float: right;
            padding: 15px;
        }

        .cart-logo {
            width: 30px; /* Adjust the size as needed */
            height: auto;
            vertical-align: middle;
            margin-right: 5px;
        }
    </style>
</head>
<body>

<header>
    <h1>My E-Commerce Website</h1>
</header>

<nav>
    <a href="#">Home</a>
    <a href="ViewProduct">Products</a>
    <a href="customerLogin.jsp">Customer Login</a>
    <a href="customerRegistrationForm.jsp">Customer Registration</a>
    <a href="adminLoginForm.jsp">Admin Login</a>
    <div class="cart-container">
        <a href="MyCartServlet">
            <img class="cart-logo" src="path/to/cart-logo.png" alt="Cart Logo">
            My Cart
        </a>
    </div>
</nav>

<!-- Your page content goes here -->

</body>
</html>
