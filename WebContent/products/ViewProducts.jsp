<%@page import="java.util.List"%>
<%@page import="com.servelts.Product"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>PRODUCT LIST</h1>
	<%
		List<Product> products = (List<Product>) request.getAttribute("products");
	for (int i = 0; i < products.size(); i++) {
	%>
	<h1><%=products.get(i).pName%></h1>
	<h2><%=products.get(i).pPrice%></h2>
	<h2><%=products.get(i).pQty%></h2>


	<%
		}
	%>
</body>
</html>