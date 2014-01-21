<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%> 
<%@ taglib prefix="sx" uri="/struts-dojo-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Home</title>
<script language="javascript">
	window.history.forward(1);
</script>
<link rel="stylesheet" type="text/css" href="css/style.css" />
</head>
<body bgcolor="#FFF8DC">
<center><font color="#A80000" face="AR BONNIE" size="55">
<b>This is XYZ AIR TRAVELS LTD!</b> </font> <br></br>
<font color="#A80000" face="Palace Script MT" size="75"> <b>
Successful login! User.....!</b> </font>
<hr class="flare" />
<font color="Black" face="Palace Script MT" size="200"> <s:iterator value="action">
<table align="center"><tr><td>
You have enterd through id 
<s:property value="cb.id" />...!</s:iterator></font></td></tr>
<tr><td><s:form action="UserDisplayAllFlights">
<s:submit value="Display all flights"></s:submit>
 </s:form></td>
<td><s:form action="UserDisplayAllSchedules">
<s:submit value="Display all schedules"></s:submit>
</s:form></td></tr>
<tr><td align="center"><s:form action="ReserveAction">
<s:submit value ="Click here to Reserve the ticket">
</s:submit>
</s:form></td></tr>

<tr><td><s:a href="ChangePassword.jsp">ChangePassword</s:a></td></tr>
<s:form action="selectRID">
	<s:submit value="Click here to view your Tickets">
	</s:submit>
</s:form>
<tr><td align="center"><s:form action="Logout">
<s:submit value="Logout"> 
</s:submit>
</s:form></td></tr>
</table>
</center>
</body>
</html>