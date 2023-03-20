<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>info JSP</title>
</head>
<body>
<table border="1">
	<tr>
		<td>Product Code</td>
		<td>${prod.code}</td>
	</tr>
	<tr>
		<td>Product Name</td>
		<td>${prod.name}</td>
	</tr>
	<tr>
		<td>Price</td>
		<td>${prod.price}</td>
	</tr>
</table>

</body>
</html>