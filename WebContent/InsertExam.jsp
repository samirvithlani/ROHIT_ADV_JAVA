<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="insertexam">
		<table>
			<tr>
				<td>ENTER EXAM NAME</td>
				<td><input type="text" name="txtExamName">
				${nameerror}
				</td>
			</tr>
			<tr>
				<td>ENTER EXAM venue</td>
				<td><input type="text" name="txtExamVenue">
				${venueerror}
				</td>
			</tr>
			<tr>

				<td><input type="submit" value="SUBMIT"></td>
			</tr>

		</table>

	</form>
</body>
</html>