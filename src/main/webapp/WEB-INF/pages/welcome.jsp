<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="generateEmpE2E" method="get">
		<div class="container">
			<h4>Employee Creation</h4>
			<p>Please fill in this form to create an account.</p>
			<hr>

			<label for="fname"><b>First Name</b></label> <input type="text"
				placeholder="Enter First Name" name="fname" required> <label
				for="lname"><b>Last Name</b></label> <input type="text"
				placeholder="Enter Last Name" name="lname" required>
			<hr>
			<button type="submit" class="registerbtn">Register</button>
		</div>
</body>
</html>