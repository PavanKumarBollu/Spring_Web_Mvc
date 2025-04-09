<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" %>
   <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%-- <h1>${name}</h1>
	<h1>${age}</h1>
	<h1>${addr}</h1> --%>
	
	<h1 style='color: red; text-align: center;'>Displaying Array values</h1>
	<c:forEach items="${names }" var="name">
	
	</c:forEach>
	
	
</body>
</html>