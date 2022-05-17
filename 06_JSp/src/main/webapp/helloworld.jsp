<%@page import="java.time.LocalDate"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>DEKH Bhai!!</title>
</head>
<body>
	<%!String message = "java is best programming language"; %>
	<%!double  num1 = 100.13; %>
	<%!double  num2 = 102.85; %>
	<%!LocalDate date = LocalDate.now(); %>
	<% 
	for(int i=0;i<10;i++)
	{
	%>
	<h3>JSP is simple</h3>
	<%
	}
	%>
	<%out.println(date); %>
	<%out.println(message); %>
	<br>
	Result : <%= num1 + num2 %>
	</body>
</html>