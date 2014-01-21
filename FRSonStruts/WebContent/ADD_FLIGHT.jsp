<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="/struts-tags" prefix="s"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<link rel="stylesheet" type="text/css" href="css/style.css" />
</head>
<body bgcolor="#FFF8DC">

<font color="#A80000" face="arial" size="45"> <b>XYZ Air Travels Ltd.</b> </font> <br />
<hr class='flare'>
<s:head/>
<font color="#A80000" face="arial" size="15"> <b> Please
Register a new FLIGHT here </b> </font>
<h2><i>Flight details</i></h2>
<hr class="flare" />
<center>
<s:form method="post" action="AdminAD001">
<s:textfield name="fb.name" label="Enter the FlightName"/>
<s:textfield name="fb.seatingCapacity" label="Enter the Seating Capacity" />
<s:textfield name="fb.reservationCapacity" label="Enter the Reservation Capacity"/>
<s:submit value="Register" label="Click here to submit"></s:submit>
</s:form>
</center>
</body>
</html>