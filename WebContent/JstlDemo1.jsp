<%-- jstl is jsp std tag lib

<% %>
${ }
jstl
*/
5 tags
core
formate
sql  :- DAO layer
func
xml  :- 3.1 xml for entries
 --%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%-- <%

	int a=10;
%>
<%out.print(a); %>
<%=a %>
 --%>
<c:set var="income" value="${4000}"></c:set>
<c:out value="${income}"></c:out>
<!-- if(income>35000){
	print("u r el")
} -->
<!-- //test is use for provide condition... -->
<c:if test="${ income>35000}">
	<c:out value="You are eligible..."></c:out>
</c:if>
 
 <!-- for(int i=0;i<10;i++){
 	print(i)
 }  -->
 
<c:forEach var="i" begin="1" end="20">

	<c:if test="${i %2 ==0 }">
		<font color="red"><h3><c:out value="${i }"></c:out></h3></font>
	</c:if>	
	
</c:forEach> 
 
 
</body>
</html>