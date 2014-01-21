
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
<center><font color="#A80000" face="arial" size="45"> <b>XYZ AirTravels Ltd.</b> </font> <br />
<s:form action="Reserve">
	
	<s:textfield label="Enter No of Seats(Max 3 Seats):" name="reservation.noOfSeats" />
	<s:select  headerValue="Select Class" label="Choose your Class:" name="reservation.reservationType"  list=" {'Economy class','Business Class'}"/>
<table>
<tr>
<td>Passenger 1</td>
<td>Passenger 2</td>
<td>Passenger 3</td>
<td></td>
<td></td>
</tr>
<tr>

<td>
	<table>

		<tr>
			<td>FullName</td>
		<td><s:textfield  name="passengerBean1.fullName" /></td>
			</tr>
				<tr>
			<td>Gender</td>
		<td><s:textfield  name="passengerBean1.gender" /></td>
			</tr>
				<tr>
			<td>Age</td>
		<td><s:textfield  name="passengerBean1.age" /></td>
			</tr>
				<tr>
			<td>Seat No</td>
		<td><s:textfield  name="passengerBean1.seatNo" /></td>
			</tr>
</table>
</td>
<td>
	<table>

		<tr>
			<td>FullName</td>
		<td><s:textfield  name="passengerBean2.fullName" /></td>
			</tr>
				<tr>
			<td>Gender</td>
		<td><s:textfield  name="passengerBean2.gender" /></td>
			</tr>
				<tr>
			<td>Age</td>
		<td><s:textfield  name="passengerBean2.age" /></td>
			</tr>
				<tr>
			<td>Seat No</td>
		<td><s:textfield  name="passengerBean2.seatNo" /></td>
			</tr>
</table>
</td>
<td>
	<table>

		<tr>
			<td>FullName</td>
		<td><s:textfield  name="passengerBean3.fullName" /></td>
			</tr>
				<tr>
			<td>Gender</td>
		<td><s:textfield  name="passengerBean3.gender" /></td>
			</tr>
				<tr>
			<td>Age</td>
		<td><s:textfield  name="passengerBean3.age" /></td>
			</tr>
				<tr>
			<td>Seat No</td>
		<td><s:textfield  name="passengerBean3.seatNo" /></td>
			</tr>
</table>
</td>
</tr>
</table>
	<table bordercolor="black">
		<tr>
			<td>ScheduleID</td>
			<td>FlightId</td>
			<td>Flight Name</td>
			<td>From</td>
			<td>To</td>
			<td>Travel Duration</td>
			<td>Departure Time</td>
			<td>distance</td>
			<td>Fare</td>
		</tr>

		<tr>


			<td><s:property value="scheduleFromBl.id" /></td>
			<td><s:property value="scheduleFromBl.flightId" /></td>
			<td><s:property value="flightName" /></td>
			<td><s:property value="forUser.source" /></td>
			<td><s:property value="forUser.destination" /></td>
			<td><s:property value="scheduleFromBl.travelDuration" /></td>
			<td><s:property value="scheduleFromBl.departureTime" /></td>
			<td><s:property value="forUser.distance" /></td>
			<td><s:property value="forUser.fare" /></td>
			<td><s:submit value="Book" /></td>

		</tr>


	</table>
	
</s:form>
</center>
</body>
</html>