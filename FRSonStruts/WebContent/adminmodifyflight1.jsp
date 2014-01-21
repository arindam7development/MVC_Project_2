
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="s" uri="/struts-tags"%>     
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View All Flights</title>
<link rel="stylesheet" type="text/css" href="css/style.css" />
</head>
<body bgcolor="#FFF8DC">
<center>Modify Flight Details <br></br>
<table>

	<s:form action="ModifyFlightAction">
	<tr>
			<td>FlightId:</td>
			<td><s:textfield readonly="true" name="forModify.id"/></td>
		</tr>
		<tr>
			<td>Flightname:</td>
			<td><s:textfield name="forModify.name" /></td>
		</tr>
		<tr>
			<td>Seating Capacity:</td>
			<td><s:textfield  name="forModify.seatingCapacity" /></td>
		</tr>

		<tr>
			<td>Reservation Capacity:</td>
			<td><s:textfield name="forModify.reservationCapacity" /></td>
		</tr>
		
		<s:submit name="Add Flight"></s:submit>
	</s:form>
</table>
</center>
</body>
</html>