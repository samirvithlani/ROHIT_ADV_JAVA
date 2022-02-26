<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="insertuser">
		<table>
			<tr>
				<td>ENTRE USER NAME:</td>
				<td><input type="text" name="txtUserName">
				${uerror }
				</td>
			</tr>
			<tr>
				<td>ENTRE USER Age:</td>
				<td><input type="text" name="txtUserAge"></td>
			</tr>
			<tr>
				
				<td><input type="submit" value="SUBMIT"></td>
			</tr>
		</table>

	</form>
</body>
</html>