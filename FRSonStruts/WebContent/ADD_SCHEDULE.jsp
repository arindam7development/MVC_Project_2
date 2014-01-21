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

              <center><font color="#A80000" face="arial" size="45"> <b>XYZ AIRLINES
            Corp.</b> </font> <br />
           <hr class='flare'>

         <font color="#A80000" face="arial" size="15"> <b> Please
    Register a new SCHEDULES DETAILS  </b> </font>
          <h2><i></i></h2>
         <hr class="flare" />
<s:form method="post" action="AddSchedule1">
 <h2><i>Choose Flight id</i></h2>

<s:select label="Choose the Flight" list="alistFlight"  listValue="id" listKey="id" name="schedulebean.flightId"/>
<s:select label="Choose the Route id" list="alistRoute" listValue="id" listKey="id" name ="schedulebean.routeId"></s:select>
<table>
		<tr>
			<td>TravelDuration</td>
			<td><s:textfield theme="simple" name="schedulebean.travelDuration" /></td>
		</tr>
      <tr>
			<td>AvailableDays</td>
			<td><s:textfield theme="simple" name="schedulebean.availableDays" /></td>
		</tr>
<tr>
			<td>DepartureTime</td>
			<td><s:textfield theme="simple" name="schedulebean.departureTime" /></td>
		</tr>
</table>
<s:submit value="Add Schedule"></s:submit>
</s:form></center>

</body>
</html>