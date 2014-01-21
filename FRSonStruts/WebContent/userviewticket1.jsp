<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<<link rel="stylesheet" type="text/css" href="css/style.css" />
</head>
<body>
<body bgcolor="#FFF8DC">
<center><font color="#A80000" face="arial" size="45"> <b>XYZ AirTravels Ltd.</b> </font> <br />
<h1>Ticket Details</h1>

<table border=20  bgColor="#F5A9A9" >

	<tr>
		<td>Reservation ID</td>
		<td colspan="2" bgcolor="#FFCC66"><s:property value="ticket.id" /></td>
	</tr>
	<tr>
		<td>user ID</td>
		<td colspan="2" bgcolor="#FFCC66"><s:property value="ticket.userId" /></td>
	</tr>
	<tr>
		<td>FlightId</td>
		<td colspan="2" bgcolor="#FFCC66"><s:property value="ticket.flightId" /></td>
	</tr>
	<tr>
		<td>From</td>
		<td colspan="2" bgcolor="#FFCC66"><s:property value="ticket.source" /></td>
	</tr>
	<tr>
		<td>TO</td>
		<td colspan="2" bgcolor="#FFCC66"><s:property value="ticket.destination" /></td>
	</tr>


	<tr>
		<td>No. of Seats</td>
		<td colspan="2" bgcolor="#FFCC66"><s:property value="ticket.noOfSeats" /></td>

	</tr>




	<tr>
		<td>Full Name</td>
		<td>Gender</td>
		<td>Seat No</td>
		<td>Age</td>
	</tr>

	<s:iterator value="ticket1">
		<tr>

			<td colspan="2" bgcolor="#FFCC66"><s:property value="fullName" /></td>
			<td colspan="2" bgcolor="#FFCC66"><s:property value="gender" /></td>
			<td colspan="2" bgcolor="#FFCC66"><s:property value="seatNo" /></td>
			<td colspan="2" bgcolor="#FFCC66"><s:property value="age" /></td>
		</tr>
	</s:iterator>



	<tr>
		<td>reservationType</td>
		<td colspan="2" bgcolor="#FFCC66"><s:property value="ticket.reservationType" /></td>
	</tr>
	<tr>
		<td>bookingStatus</td>
		<td colspan="2" bgcolor="#FFCC66"><s:property value="ticket.bookingStatus" /></td>
	</tr>
	<tr>
		<td>bookingDate</td>
		<td colspan="2" bgcolor="#FFCC66"><s:property value="ticket.bookingDate" /></td>
	</tr>
	<tr>
		<td>journeyDate</td>
		<td colspan="2" bgcolor="#FFCC66"><s:property value="ticket.journeyDate" /></td>
	</tr>
	<tr>
		<td>Total fare</td>
		<td colspan="2" bgcolor="#FFCC66"><s:property value="ticket.fare" /></td>
	</tr>



</table>
<s:a href="userhome.jsp">Return to home page</s:a>
</center>

</body>
</html>