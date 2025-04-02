<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Course Info :: </h1>

	<table border='2'>
		<tr>
			<td>Book Name </td>
			<td>${book.bname}</td>
		</tr>
		<tr>
			<td>Book Author </td>
			<td>${book.author}</td>
		</tr>
		<tr>
			<td>Book Price </td>
			<td>${book.price}</td>
		</tr>
		
	</table>
</body>
</html>