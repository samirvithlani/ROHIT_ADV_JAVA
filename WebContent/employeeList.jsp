<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
		String firstName = (String) request.getAttribute("firstName");
	%>
	<h1><%=firstName%></h1>

	<h1><%=(String) request.getAttribute("lastName")%></h1>
	<h1><%=(String) request.getAttribute("email")%></h1>
	<h1><%=(String) request.getAttribute("password")%></h1>
	<h1><%=(Integer) request.getAttribute("age")%></h1>





</body>
</html>