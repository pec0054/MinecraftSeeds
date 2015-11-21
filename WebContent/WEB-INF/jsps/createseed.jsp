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
	<sf:form method="post"
		action="${pageContext.request.contextPath}/docreate"
		commandName="seed">
		<table class="formtable">
			<tr>
				<td class="label">Seed Name:</td>
				<td><sf:input class="control" path="seedName" name="seedName"
						type="text" /><br />
				<sf:errors path="seedName" cssClass="error"></sf:errors></td>
			</tr>
			<tr>
				<td class="label">Seed Value:</td>
				<td><sf:input class="control" name="seedValue" path="seedValue"
						type="text" /><br />
				<sf:errors path="seedValue" cssClass="error"></sf:errors></td>
			</tr>
			<tr>
				<td class="label">Platform:</td>
				<td><sf:select name="platform" class="control" path="platform">
						<sf:option value="---Select---"/>
						<sf:option value="Minecraft for PC"/>
						<sf:option value="Minecraft PE"/>
						<sf:option value="Minecraft for XBox"/>
					</sf:select>
					<br/>
				<sf:errors path="platform" cssClass="error"></sf:errors></td>
			</tr>
			<tr>
				<td></td>
				<td><input value="Create Seed" class="control" type="submit" /></td>
			</tr>
		</table>
	</sf:form>
</body>
</html>

