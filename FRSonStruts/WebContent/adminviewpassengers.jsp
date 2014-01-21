<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sx" uri="/struts-dojo-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<sx:head />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/style.css" />
</head>
<body>
<body bgcolor="#FFF8DC">
<center><font color="#A80000" face="arial" size="45"> <b>XYZ AirTravels Ltd.</b> </font> <br />
<s:form action="ViewPassengers123">
	<tr>
		<td>Select flight Id:</td>
		<td><s:select list="flightId" name="flighIdFromUI" /></td>
	</tr>
	<tr>
		<td>Choose the Date:</td>
		<td><sx:datetimepicker name="admindate" displayFormat="dd-MMM-yyyy"
			label="Choose the Journey Date" /></td>
	</tr>

	<s:submit name="ViewFlight"></s:submit>
</s:form>
</body>
</html>