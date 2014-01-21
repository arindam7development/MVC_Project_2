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

         <font color="#A80000" face="arial" size="15"> <b> Please delete
    the appropriate flights  </b> </font>
          <h2><i></i></h2>
         <hr class="flare" />

 <h2><i>Choose Flight id</i></h2>
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
<s:form method="post" action="Delete_Flight">
<s:checkboxlist list="alistFlight" listKey="id"  listValue="id" name="flightIDs"></s:checkboxlist>

<s:submit value="Delete Flights"></s:submit>

</s:form></center>

</body>
</html>