<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>displayProducts JSP</title>
</head>
<body>
<h1>Product List</h1>

<table border="1">
<tr>
	<th>Product Code</th>
	<th>Product Name</th>	
	<th>Price</th>
</tr>
<c:forEach var="p" items="${prodList}">		
<tr>
	<td>${p.code}</td>
	<td>${p.name}</td>	
	<td>${p.price}</td>	
</tr>
</c:forEach>	
</table>
<br/><br/><br/>

</body>
</html>