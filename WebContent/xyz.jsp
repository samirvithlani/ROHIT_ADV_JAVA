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
		String name = (String) session.getAttribute("name");
	%>
	<%=name%>
	<%
		String name2 = (String)application.getAttribute("name1");
	
	%>
	<%=name2 %>
</body>
</html>