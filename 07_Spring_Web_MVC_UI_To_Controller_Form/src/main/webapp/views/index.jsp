<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Book Store</title>
</head>
<body>
	<h1>Book Info :: </h1>

	<form action="/books" method = "Post" modelAttribute="book">
		<table border='2'>
			<tr>
				<td>Book Name </td>
				<td><input type = "text" name="bname" /></td>
			</tr>
			<tr>
				<td>Book Author </td>
				<td><input type = "text" name="author" /></td>
			</tr>
			<tr>
				<td>Book Price </td>
				<td><input type = "text" name="price" /></td>
			</tr>
			<tr>
				
				<td colspan=2><input type = "submit" value="Submit" /></td>
			</tr>
		</table>
	</from>
</body>
</html>