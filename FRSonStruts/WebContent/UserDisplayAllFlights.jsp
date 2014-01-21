<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View All Flights</title>
<link rel="stylesheet" type="text/css" href="css/style.css" />
</head>
<body bgcolor="#FFF8DC">
<center>Flight Details <br></br>
<hr class="flare" />
<table border=2 bgColor="white">
	<tr>
		<td>Flight ID</td>
		<td>Flight Name</td>
		<td>Seating Capacity</td>
		<td>Reservation Capacity</td>
		<td></td>
	</tr>
	<s:iterator value="alistFlight">
		<tr>
			<td><s:property value="id" /></td>
			<td><s:property value="name" /></td>
			<td><s:property value="seatingCapacity" /></td>
			<td><s:property value="reservationCapacity" /></td>
	</s:iterator>

</table>
<br></br>
<s:a href="userhome.jsp">Go to Home Page</s:a>
<s:form method="post" action="Logout">
	<s:submit value="Logout"></s:submit>
</s:form></center>
</body>
</html>