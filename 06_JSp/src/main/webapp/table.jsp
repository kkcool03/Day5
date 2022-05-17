<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Multiplication Table</title>
</head>
<body>
	<%!int num; %>
	<%num=Integer.parseInt(request.getParameter("number")); %>
	<h3>Multiplication Table of <%=num%></h3>
	
	<table border="1"><% 
	for(int i=0;i<10;i++)
	{
	%>
		<tr>
		<td><%= num %></td><td><%= i %></td><td><%= num*i %></td>
		</tr>
	<%} %>
	</table>
</body>
</html>