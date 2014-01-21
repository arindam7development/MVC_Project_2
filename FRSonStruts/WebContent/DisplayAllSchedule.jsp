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
<center>Schedule Details <br></br>
<hr class="flare" />
<table border=2 bgColor="pink">
	<tr>
		<td>Schedule ID</td>
		<td>Flight ID</td>
		<td>Route ID</td>
		<td>Available days</td>
		<td>Departure Time</td>
		<td>TravelDuration</td>
		<td></td>
	</tr>
	<s:iterator value="alistSchedule">
		<tr>
			<td><s:property value="id" /></td>
			<td><s:property value="flightId" /></td>
			<td><s:property value="routeId" /></td>
			<td><s:property value="availableDays" /></td>
			<td><s:property value="departureTime" /></td>
			<td><s:property value="travelDuration" /></td>
	</s:iterator>

</table>
<br></br>
<s:a href="AdminHome.jsp">Return to home page</s:a>
<s:form method="post" action="Logout">
	<s:submit value="Logout"></s:submit>
</s:form></center>
</body>
</html>