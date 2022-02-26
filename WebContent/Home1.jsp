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
		int a = 100, b = 20;
	if (a > b) {
	%>

	<h1>A IS GREATER....</h1>


	<%
		} else {
		out.print("b is greater");
	}
	%>

	<h1>DONE.....</h1>


</body>
</html>