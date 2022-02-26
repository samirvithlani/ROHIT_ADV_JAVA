<%@page import="com.dao.ElDemoBean"%>
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
		String name = (String) request.getAttribute("name");
	out.print(name);
	%>

	<br>
	<%=request.getAttribute("name")%>

	<!-- if we want to replace with expression lanaguge syntex are below.... -->
	<br> ${name }
	<%-- 
		<%
			ElDemoBean el = (ElDemoBean) request.getAttribute("el");
		%>
		<%=el.getId()%>
		<%=el.getName()%> --%>
	
	
	<br>
	
	${el.id }
	${el.name }



</body>
</html>