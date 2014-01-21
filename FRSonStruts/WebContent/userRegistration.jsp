<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri= "/struts-tags" prefix="s" %>
<%@ taglib prefix="sx" uri="/struts-dojo-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head >
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<link rel="stylesheet" type="text/css" href="css/style.css" />
<sx:head />
</head>
<body  bgcolor="#FFF8DC" >

<center>
<font color="#A80000"  face="arial" size="45"> 
<b>XYZ AIRLINES</b>
</font>
<br/>
<hr class='flare'>

<font color="#A80000"  face="arial" size="15"> 
<b> Please Register here  </b>
</font>
<h2><i>Your details</i></h2> 
<hr class="flare" />
<s:form method="post" action="FRS_Registration_action1">
<s:textfield name="profilebean.firstName" label="Enter your first name"/>
<s:textfield name="profilebean.lastName" label="Enter your lastName"/>
<s:textfield name="profilebean.gender" label="Enter your gender"/>
<s:textfield name="profilebean.street" label="Enter your street"/>
<s:textfield name="profilebean.location" label="Enter your location"/>
<s:textfield name="profilebean.city" label="Enter your city"/>
<s:textfield name="profilebean.state" label="Enter your state"/>
<s:textfield name="profilebean.pincode" label="Enter your pincode"/>
<s:textfield name="profilebean.mobileNo" label="Enter your mobileNo"/>
<s:textfield name="profilebean.emailId" label="Enter your emailId"/>
<s:password  name="profilebean.password" label="Enter your password"/>
<sx:datetimepicker name="date1" displayFormat="dd-MMM-yyyy" value="todayDate" name="profilebean.dateOfBirth" label="Enter your DateOfBirth"/>
<s:submit align="right" value="Register" label="Click here to submit"></s:submit>
</s:form> 
</center>
</body>
</html>