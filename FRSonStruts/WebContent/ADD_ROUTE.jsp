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

<center><font color="#A80000" face="arial" size="45"> <b>XYZ AIR LINES</b> </font> <br />
<hr class='flare'>

<font color="#A80000" face="arial" size="15"> <b> Please
Register a new ROUTE DETAILS  </b> </font>
<h2><i>Route details</i></h2>
<hr class="flare" />
<s:form method="post" action="AdminRoute">
<s:head/>
<s:fielderror></s:fielderror>
	<table>
		<tr>
			<td>Enter the Source:</td>
			<td><s:textfield theme="simple" name="routebean.source" /></td>
		</tr>
		<tr>
			<td>Enter the Destination:</td>
			<td><s:textfield theme="simple" name="routebean.destination" /></td>
		</tr>
		<tr>
			<td>Enter Distance</td>
			<td><s:textfield theme="simple" name="routebean.distance" /></td>
		</tr>
		<tr>
			<td>Enter Fare</td>
			<td><s:textfield theme="simple" name="routebean.fare" /></td>
		</tr>
		<tr>
			<td>Click here to submit</td>
			<td><s:submit value="Register"></s:submit></td>
		</tr>
	</table>
</s:form></center>

</body>
</html>