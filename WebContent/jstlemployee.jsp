<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<c:forEach items="${employees}" var="employee">
	<c:out value="${employee}"></c:out>
</c:forEach>
	<%-- <%
		List<String> employees = (List<String>)request.getAttribute("employees");
	for (int i = 0; i < employees.size(); i++) {
	%>

	<h1>
		<%=employees.get(i)%>
	</h1>

	<%
		}
	%>
 --%>
 
 </body>
</html>