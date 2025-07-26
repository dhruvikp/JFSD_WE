<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<jsp:include page="header.jsp"></jsp:include>

<jsp:useBean id="bean" class="com.simplilearn.MyBean" scope="request"></jsp:useBean>

<jsp:setProperty property="name" name="bean" value="Dhruvik" />

Hello, <jsp:getProperty property="name" name="bean"/>

<jsp:forward page="forward.jsp"></jsp:forward>

 
</body>
</html>