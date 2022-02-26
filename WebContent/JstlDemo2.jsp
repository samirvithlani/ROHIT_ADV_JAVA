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
<c:set var="salary" value="10000"></c:set>

<c:choose>

	<c:when test="${salary>50000 }">
		
			<font color="blue"><c:out value="you can get Hike.."></c:out></font>
	</c:when>
	<c:otherwise>
			<font color="red"><c:out value="you can't get Hike.."></c:out></font>
	</c:otherwise>
</c:choose>
</body>
</html>