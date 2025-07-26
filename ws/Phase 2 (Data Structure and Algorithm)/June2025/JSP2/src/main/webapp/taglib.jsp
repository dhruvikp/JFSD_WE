<%@page import="java.util.Date"%>
<%@page import="java.util.Arrays"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
  
<%

	List<String> names = Arrays.asList("Dhruvik","Neha","Ankit","Riya");
	request.setAttribute("nameList", names);
	
	Date today = new Date();
	request.setAttribute("currentDate", today);
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
	
	<c:if test="${not empty nameList}">
		<p>We have names to show!</p>
	</c:if>

	<c:forEach var="name" items="${nameList}">
		<li>${name}</li>
	</c:forEach>
	
	
	<c:set var="name" value="Dhruvik Parikh" />
	<p> Hello, ${name} !</p>
	
	<p>Today's date is:
		<fmt:formatDate value="${currentDate}" pattern="dd-MM-yyyy" /> <br/>
		<fmt:formatDate value="${currentDate}" pattern="dd MMM yyyy hh:mm a" />
	</p>
	
</ul>

	

</body>
</html>