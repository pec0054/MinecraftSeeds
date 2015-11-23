<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="${pageContext.request.contextPath}/static/css/main.css" rel="stylesheet" type="text/css" />
<title>Insert title here</title>
</head>
<body>
	<sf:form method="post" action="${pageContext.request.contextPath}/createuser" commandName="user">
		<table class="formtable">
			<tr>
				<td class="label">User Name:</td><td>
				<sf:input class="control" path="userName" name="userName" type="text" /><br /><sf:errors path="userName" cssClass="error"></sf:errors></td>
			</tr>
			<tr>
				<td class="label">Full Name:</td>
				<td><sf:input class="control" path="name" name="name" type="text" /><br /><sf:errors path="name" cssClass="error"></sf:errors></td>
			</tr>
			<tr>
				<td class="label">Email Address:</td>
				<td><sf:input class="control" path="email" name="email" type="text" /><br /><sf:errors path="userName" cssClass="error"></sf:errors></td>
			</tr>
			<tr>
				<td class="label">Password:</td>
				<td><sf:input class="control" name="password" path="password" type="text" /><br /><sf:errors path="password" cssClass="error"></sf:errors></td>
			</tr>
			<tr>
				<td class="label">Confirm Password:</td>
				<td><input class="control" name="confirmpassword" type="text" /><br /></td>
			</tr>
			<tr>
				<td></td>
				<td><input value="Create User" class="control" type="submit" /></td>
			</tr>
		</table>
	</sf:form>
</body>
</html>

