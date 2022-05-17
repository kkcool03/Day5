<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%!String name;
		String loc;
	%>
	<%name=request.getParameter("txtname"); 
	loc = request.getParameter("txtlocation");
	%>
	
	<h2>Hi, <%= name%> </h2>
	<br>
	<h2>Address: <%= loc %></h2>
</body>
</html>