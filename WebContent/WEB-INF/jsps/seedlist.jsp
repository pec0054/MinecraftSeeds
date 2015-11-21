<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<link href="${pageContext.request.contextPath}/static/css/main.css" rel="stylesheet" type="text/css" />

<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>List of all seeds</title>
</head>
<body>

<table class="seeds">
<tr><td>Name</td><td>Value</td><td>Platform</td></tr>

<c:forEach var="seed" items="${seeds}">
<tr>

<td><c:out value="${seed.seedName}"></c:out></td>

<td><c:out value="${seed.seedValue}"></c:out></td>

<td><c:out value="${seed.platform}"></c:out></td>
   
</tr>
</c:forEach>
</table>
<p><a href="${pageContext.request.contextPath}/">Home</a></p>
</body>
</html>