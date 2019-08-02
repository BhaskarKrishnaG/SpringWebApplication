<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<h4>Employee Created Successfully!</h4>
		<p>Below are the details.</p>
		<hr>

		<label for="name"><b>Full Name:</b></label>
		<%=request.getAttribute("Name")%>
		<br>
		<label for="id"><b>Employee Id:</b></label>
		<%=request.getAttribute("Id")%>
		<br>
		<label for="mail"><b>Employee mail id:</b></label>
		<%=request.getAttribute("Mail")%>

		<hr>
	</div>
</body>
</html>