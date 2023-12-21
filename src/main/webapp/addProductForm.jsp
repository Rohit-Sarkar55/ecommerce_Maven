<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Add Product</title>
    <style>
        body {
            font-family: Arial, sans-serif;
        }

        form {
            max-width: 500px;
            margin: 20px auto;
        }

        label {
            display: block;
            margin-bottom: 8px;
        }

        input, select {
            width: 100%;
            padding: 10px;
            margin-bottom: 15px;
            box-sizing: border-box;
        }

        textarea {
            width: 100%;
            padding: 10px;
            margin-bottom: 15px;
            box-sizing: border-box;
        }

        input[type="file"] {
            margin-bottom: 20px;
        }

        button {
            background-color: #4CAF50;
            color: white;
            padding: 10px 15px;
            border: none;
            border-radius: 4px;
            cursor: pointer;
        }

        button:hover {
            background-color: #45a049;
        }
    </style>
</head>
<body>
    <form action="AddProductServlet" method="post"  enctype="multipart/form-data"  >
        <label for="name">Enter Name:</label>
        <input type="text" id="name" name="name" required>

        <label for="price">Price:</label>
        <input type="number" id="price" name="price" required>

        <label for="description">Description:</label>
        <textarea id="description" name="description" rows="4" required></textarea>

        <label for="mrp">MRP Price:</label>
        <input type="number" id="mrp" name="mrp" required>

        <label for="status">Status:</label>
        <select id="status" name="status">
            <option value="Active">Active</option>
            <option value="Inactive">Inactive</option>
        </select>

        <label for="category">Product Category:</label>
        <input type="text" id="category" name="category" required>
			
			
        <label for="file">Attach File:</label>
        <input type="file" id="file" name="file" accept=".jpg, .jpeg, .png">
		
        <input type="submit" value="Add Product" >
    </form>
</body>
</html>
