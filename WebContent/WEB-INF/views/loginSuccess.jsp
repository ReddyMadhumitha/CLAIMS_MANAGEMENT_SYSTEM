<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Success</title>
</head>
<body bgcolor="pink">
	<div align="center">
		<h2>
			<%
				out.print("Your successfully login to Claims Managament System!!!");
			%>
		</h2>
		<h3>
			<a href="claimRequest">Raise Claim Request</a>
		</h3>
		<br />
		<h3>
			<a href="homepage">Home</a>
		</h3>
	</div>
</body>
</html>