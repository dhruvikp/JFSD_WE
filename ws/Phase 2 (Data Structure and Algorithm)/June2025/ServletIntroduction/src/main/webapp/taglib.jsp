<%@page import="java.util.Arrays"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
  
<%

	List<String> names = Arrays.asList("Dhruvik","Neha","Ankit","Riya");
	request.setAttribute("nameList", names);
%>

    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h2>Names list using JSTL:</h2>
<ul>
	<c:forEach var="name" items="${nameList}">
		<li>${name}</li>
	</c:forEach>
</ul>

	

</body>
</html>