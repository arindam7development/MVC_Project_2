<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>:: Welcome ::</title>
<script language="javascript">
	window.history.forward(1);
</script>
<link rel="stylesheet" type="text/css" href="css/style.css" />
</head>
<body bgcolor="#FFF8DC">
<center><font color="#A80000" face="AR BONNIE" size="55">
<b>This is XYZ AIR TRAVELS LTD!</b> </font> <br></br>
<font color="#A80000" face="Palace Script MT" size="75"> <b>
Successful login! Welcome.....!</b></font>
<hr class="flare" />
<font color="Black" face="arial" size="5"> <s:iterator
	value="action">You have logged in as
	<s:property value="cb.id" />...!</s:iterator></font>
<h2>You can perform the following tasks !!!!!</h2>

<s:a href="ADD_FLIGHT.jsp" font="arial">ADD FLIGHT DETAILS</s:a>
<s:form action="AdminDisplayAllFlights">
<s:submit value="Display all flights"></s:submit>
 </s:form>
 <s:form action="ModifyPopulate">
 <s:submit value="Modify Flight Details"></s:submit>
 </s:form>
<s:form action="Delete_populate">
<s:submit value ="Delete flight details" ></s:submit>
</s:form>
<br></br>
<s:a href="ADD_ROUTE.jsp">ADD ROUTE DETAILS</s:a>
<s:form method="post" action="AdminDisplayAllRoutes">
<s:submit value="Display all routes"></s:submit>
 </s:form>
<br></br>
<s:form action="AddSchedule">
<s:submit value ="ADD SCHEDULE DETAILS" ></s:submit>
</s:form>
<s:form action="AdminDisplayAllSchedules">
<s:submit value="Display all schedules"></s:submit>
</s:form><br></br>
<s:form action="ViewPassengers">
			<s:submit value="View Passenger Details"></s:submit>
		</s:form>
<br></br>
<s:form method="post" action="Logout">
<s:submit value="Logout"></s:submit>
</s:form>
<hr class="flare" />
</center>
</body>
</html>



