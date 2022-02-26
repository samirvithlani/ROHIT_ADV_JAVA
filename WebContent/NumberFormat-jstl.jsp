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
<c:set var="amount" value="9850.14115"></c:set>
<p>Formatted Number 1</p>
<fmt:formatNumber value="${amount }" type="currency"></fmt:formatNumber>
<p>Formatted Number 2</p>
<fmt:formatNumber value="${amount }" type="number"></fmt:formatNumber>
<p>Formatted Number 3</p>
<fmt:formatNumber value="${amount }" type="number" maxIntegerDigits="4"></fmt:formatNumber>
<p>Formatted Number 4</p>
<fmt:formatNumber value="${amount }" type="number" maxFractionDigits="2"></fmt:formatNumber>
<p>Formatted Number 5</p>
<fmt:formatNumber value="${amount }" type="number" pattern="#.#####$"></fmt:formatNumber>


</body>
</html>