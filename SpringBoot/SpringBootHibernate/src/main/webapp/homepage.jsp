<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>homepage JSP</title>
</head>
<body>
<a href="getAllProducts">Show All Products</a>
<hr/>
<br/><br/>
<form action="getprobyid">
	Enter Product Id to be searched<br/><br/>
	<input type="text" name="pid"/><br/><br/>
	<input type="submit" value="Get Product By Id"><br/><br/>
</form>
<hr/>

<form action="savepro">
	<input type="submit" value="Save New Product"><br/><br/>
</form>

</body>
</html>