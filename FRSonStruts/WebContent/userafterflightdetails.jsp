<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Reserve</title>
<link rel="stylesheet" type="text/css" href="css/style.css" />
</head>
<body>
<body bgcolor="#FFF8DC">
<font color="#A80000" face="arial" size="45"> <b>XYZ AirTravels Ltd.</b> </font> <br />
<font>Passenger Details</font>
<table>
<tr>
<td>FullName</td>
<td>Gender</td>
<td>Age</td>
<td>Seat No</td>

</tr>

	<tr>
		<td><s:property value="passengerBean1.fullName" /></td>
		<td><s:property value="passengerBean1.gender" /></td>
		<td><s:property value="passengerBean1.age" /></td>
		<td><s:property value="passengerBean1.seatNo" /></td>
	</tr>

	<tr>
		<td><s:property value="passengerBean2.fullName" /></td>
		<td><s:property value="passengerBean2.gender" /></td>
		<td><s:property value="passengerBean2.age" /></td>
		<td><s:property value="passengerBean2.seatNo" /></td>
	</tr>
	<tr>
		<td><s:property value="passengerBean3.fullName" /></td>
		<td><s:property value="passengerBean3.gender" /></td>
		<td><s:property value="passengerBean3.age" /></td>
		<td><s:property value="passengerBean3.seatNo" /></td>
	</tr>
</table>

<font>Ticket Details (PLEASE NOTICE YOUR RESERVATION ID THE FIRST COLUMN VALUE--inorder to view your eTicket)</font>
<table>
	<tr>

		
		<td><s:property value="reservation.id" /></td>
		<td><s:property value="reservation.userId" /></td>
		<td><s:property value="reservation.flightId" /></td>
		<td><s:property value="reservation.source" /></td>
		<td><s:property value="reservation.destination" /></td>
		<td><s:property value="reservation.reservationType" /></td>
		<td><s:property value="reservation.bookingStatus" /></td>
		<td><s:property value="reservation.bookingDate" /></td>
		<td><s:property value="reservation.journeyDate" /></td>
		<td><s:property value="reservation.noOfSeats" /></td>
		<td><s:property value="reservation.fare" /></td>
		
		<td>
		<s:form action="usermakepayment.jsp">
		<s:submit value="Make Payment" />
		</s:form>
		</td>
		
	</tr>
</table>
</body>
</html>