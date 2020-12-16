<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="error.jsp"%>
    
<!DOCTYPE html>
	<html>
		<head>
			<meta charset="ISO-8859-1">
			<title>Insert title here</title>
		</head>
		<body>
		
			<!-- DIRECTIVE -->
			<%@ include file="header.jsp" %>
			
			<!-- DECLARATIVE -->
			<%! int a =10; %>
			
			<h1>Welcome to your first Java Server Page. Welcome to the cave!</h1>
			
			<!-- SCRIPTLET -->
			<%	out.println("This is written in a SCRIPTLET tag" + "<br/>"); 
				int b = 7/0;
			%>
			
			<br/>
			
			<!-- EXPRESSION -->
			<%= "Wrote this string in an EXPRESSION tag" %>
			
			<br/>
			
			<%= "Value of a variable declared in DECLARATION tag = " %>
			<%= a %>
		</body> 
	</html>