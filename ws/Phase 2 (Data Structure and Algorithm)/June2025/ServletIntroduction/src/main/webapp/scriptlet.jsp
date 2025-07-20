<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>Using Scriptlet</h1>

	<%
	String name = "Student";
	int age = 20;
	out.println("<p>Name: " + name + "</p>");
	out.println("<p>Age: " + age + "</p>");
	%>


	<h2>JSP Expression Example</h2>
	Current Time:
	<%=new Date()%><br /> Sum of 2+3 is
	<%=2 + 3%>

	<h2>JSP Declaration Example</h2>
	<%!
	int count = 0;

	public int incrementCounter() {
		return ++count;
	}%>

Visitor Number: <%= incrementCounter() %>
</body>
</html>