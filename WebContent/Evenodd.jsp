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
		for (int i = 1; i <= 15; i++) {
		if (i % 2 == 0) {
	%>

	<font color="red"><%=i%></font>


	<%
		} else {
	%>


	<font color="red"><%=i%></font>
	<%
		}

	}
	%>




</body>
</html>