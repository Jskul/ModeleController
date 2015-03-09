<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%
	String root = request.getContextPath();
%>
    
<!DOCTYPE html">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Application Controller</title>
	</head>
	<body>
	
		<form id="index-app-ctr-form" method="post" action="<%= root %>/do/default" >
		
			<button type="submit" formaction="<%= root %>/do/service1">Service 1</button>
			<button type="submit" formaction="<%= root %>/do/service2">Service 2</button>
			<button type="submit" formaction="<%= root %>/do/service3">Service 3</button>
			<button type="submit" formaction="<%= root %>/do/welcome">Welcome</button>
			<button type="submit" formaction="<%= root %>/do/default">Default</button>
		
		</form>
	
	</body>
</html>