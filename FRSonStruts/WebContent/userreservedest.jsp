<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%> 
<%@ taglib prefix="sx" uri="/struts-dojo-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<sx:head/>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Reserve</title>
<link rel="stylesheet" type="text/css" href="css/style.css" />
</head>
<body>
<body bgcolor="#FFF8DC">
<center><font color="#A80000" face="arial" size="45"> <b>XYZ AirTravels Ltd.</b> </font> <br />
<s:form action="GetDetails"> 

<s:select size ="1" list="destinationFromDatabase" name="destination" label="Choose the Destination">

<sx:datetimepicker name="date" displayFormat="dd-MMM-yyyy"  label="Choose the Journey Date"/>
</s:select>

<s:submit value="Click" ></s:submit>
</s:form>
</center>
</body>
</html>