<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>  
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<c:set var="name" value="samir      "></c:set>
<c:if test="${fn:contains(name,'a') }">
	<p>Samir contains a</p>
</c:if>
${fn:toUpperCase(name) }
<h1>LENTH OF name = ${fn:length(name) }</h1>

The name is starts with ${fn:startsWith(name,'z') }
The name is starts with ${fn:endsWith(name,'r') }
${fn:trim(name) }
<br>
${name }
</body>
</html>