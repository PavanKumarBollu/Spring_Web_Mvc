<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Student Info :: </h1>

<table border='2'>
	<tr>
		<td>Student ID </td>
		<td>${std.sid}</td>
	</tr>
	<tr>
		<td>Student FirstName </td>
		<td>${std.fName}</td>
	</tr>
	<tr>
		<td>Student LastName </td>
		<td>${std.lName}</td>
	</tr>
	<tr>
		<td>Student Date Of Birth </td>
		<td>${std.dob}</td>
	</tr>
	<tr>
		<td>Student City </td>
		<td>${std.city}</td>
	</tr>
	
</table>

</body>
</html>