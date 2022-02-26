<%@page import="java.util.List"%>
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
		List<String> employees = (List<String>) request.getAttribute("employeelist");

	for (int i = 0; i < employees.size(); i++) {
	%>

	<ul>
		<li><%=employees.get(i)%>
		<a href="deleteemployeeservlet?name=<%=employees.get(i)%>">DELETE</a>
		</li>
	</ul>

	<%
		}
	%>
</body>
</html>