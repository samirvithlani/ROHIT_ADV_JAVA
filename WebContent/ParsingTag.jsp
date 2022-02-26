<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
 		<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:set var="amount" value="786.970"></c:set>
<fmt:parseNumber var="x" integerOnly="true" type="number" value="${amount }"></fmt:parseNumber>
<c:out value="${x }"></c:out>

</body>
</html>