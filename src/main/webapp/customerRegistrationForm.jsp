<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Sign Up</title>
<style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f4f4f4;
        }
 
        .signup-container {
            max-width: 500px;
            margin: 50px auto;
            background: #fff;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }
 
        label {
            display: block;
            margin-bottom: 8px;
            font-weight: bold;
        }
 
        input,
        select,
        textarea {
            width: 100%;
            padding: 8px;
            margin-bottom: 16px;
            box-sizing: border-box;
        }
 
        textarea {
            resize: vertical;
        }
 
        button {
            background-color: #333;
            color: #fff;
            padding: 10px 15px;
            border: none;
            border-radius: 4px;
            cursor: pointer;
        }
 
        button:hover {
            background-color: #555;
        }
 
        .login-link {
            text-align: center;
            margin-top: 20px;
        }
</style>
</head>
<body>
 
<div class="signup-container">
<h2>Sign Up</h2>
<form action="CustomerRegistration" method="post">
<label for="name">Name:</label>
<input type="text" id="name" name="name" required>
 
        <label for="email">Email:</label>
<input type="email" id="email" name="email" required>
 
        <label for="password">Password:</label>
<input type="password" id="password" name="password" required>
 
        <label for="phone">Phone:</label>
<input type="tel" id="phone" name="phone" required>
 
        <label for="gender">Gender:</label>
<select id="gender" name="gender">
<option value="male">Male</option>
<option value="female">Female</option>

</select>
 
        <label for="address">Address:</label>
<textarea id="address" name="address" rows="4" required></textarea>
 
        <label for="pincode">Pincode:</label>
<input type="text" id="pincode" name="pincode" required>
 
        <button type="submit">Sign Up</button>
</form>
 
    <div class="login-link">
<p>Already have an account? <a href="customerLogin.jsp">Login here</a></p>
</div>
</div>
 
</body>
</html>