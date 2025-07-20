<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page isErrorPage="true" %>    <!-- Enables 'exception' -->
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h2>request</h2>
Request Method: <%= request.getMethod() %> <br/>
Request Method: <%= request.getRemoteHost() %><br/>
Request Method: <%= request.getParameter("name") %><br/>

<h2>response</h2>
<%
	response.setHeader("Cache-Control", "no-cache");
	response.setContentType("text/html");
%>

<h2>session</h2>
<%
	session.setAttribute("username", "John");
%>

Session ID: <%= session.getId() %><br/>
Username : <%= session.getAttribute("username") %>

<h2>application</h2>
<%
	application.setAttribute("appName", "EmployeePortal");
%>

Application Name: <%= application.getAttribute("appName") %>

<h2>out</h2>
<%
	out.println("<p>This is output from implicit object </p>");
%>

<h2>config</h2>
Config param: <%= config.getInitParameter("param1") %>


<h2>pageContext</h2>
<%
	pageContext.setAttribute("message", "Hello from simplilearn", pageContext.PAGE_SCOPE);
%>
Message: <%=pageContext.getAttribute("message")%>

<%
	//pageContext.forward("another.jsp");
%>

<h2>page</h2>

Page class: <%= page.getClass().getName() %>

<h2>exception</h2>


<%

	if(exception!=null) {
%>
Exception Message: <%= exception.getMessage() %><br/>
<%
	}
	else {
		out.println("No exception has occurred on this page. <br/>");
	}
%>


</body>
</html>