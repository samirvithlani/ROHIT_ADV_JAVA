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
<c:set var="date" value="<%=new java.util.Date() %>"></c:set>
<c:out value="${date }"></c:out>
<br>
TIME:
<fmt:formatDate value="${date }" type="time"/>
<br>
Date:
<fmt:formatDate value="${date }" type="date"/>
<br>
Both:
<fmt:formatDate value="${date }" type="both"/>
<br>
Short TIME:
<fmt:formatDate value="${date }" type="time" timeStyle="short"/>
<br>
<br>
Short Date:
<fmt:formatDate value="${date }" type="date" dateStyle="short"/>
<br>
Medium Date:
<fmt:formatDate value="${date }" type="date" dateStyle="medium"/>


</body>
</html>