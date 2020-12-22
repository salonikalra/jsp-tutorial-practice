<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="cnb" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	EL and Core JSTL:
	<br>
	${message}
	<br>
	<cnb:out value="blah"></cnb:out>
	<br>
	${student }
	
	<br>
	<br>
	
	${fn:toUpperCase("Examples of JSTL Functions-")}
	<br>
	<cnb:set var="str" value="My name is Saloni"></cnb:set>
	<cnb:out value="${str}"></cnb:out>
	<br>
	Length: ${fn:length(str)}
	<br>
	<cnb:forEach items="${fn:split(str, ' ')}" var="w">
	${w}
	<br>
	</cnb:forEach>
	
</body>
</html>