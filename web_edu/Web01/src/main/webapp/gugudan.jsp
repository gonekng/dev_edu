<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<c:forEach var="dan" begin="2" end="9" step="1">
		<c:out value="${dan} 단"/>
		<br>
		<c:forEach var="i" begin="1" end="9" step="1">
			<c:out value="${dan} * ${i} = ${dan*i}"/>
			<br>
		</c:forEach>
		<br>
	</c:forEach>

</body>
</html>