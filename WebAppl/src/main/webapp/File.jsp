<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>This page is about Servlet</h1>
<%= new Date().toLocaleString() %>

<br>
<a href="login"> Login Servlet </a>
</body>
</html>