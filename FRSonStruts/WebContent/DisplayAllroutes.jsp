<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Page</title>
<link rel="stylesheet" type="text/css" href="css/style.css" />
</head>
<body bgcolor="#FFF8DC">
<center>Route Details <br></br>
<hr class="flare" />
<table border=2 bgColor="yellow">
	<tr>
		<td>Route ID</td>
		<td>Source</td>
		<td>Destination</td>
		<td>Distance</td>
		<td>Fare</td>
		<td></td>
	</tr>
	<s:iterator value="alistRoute">
		<tr>
			<td><s:property value="id" /></td>
			<td><s:property value="source" /></td>
			<td><s:property value="destination" /></td>
			<td><s:property value="distance" /></td>
			<td><s:property value="fare" /></td>
	</s:iterator>

</table>
<br></br>
<s:a href="AdminHome.jsp">Go to Home Page</s:a> <br></br>
<s:form method="post" action="Logout">
	<s:submit value="Logout"></s:submit>
</s:form></center>
</body>
</html>