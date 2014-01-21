<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View All Flights</title>
<link rel="stylesheet" type="text/css" href="css/style.css" />
</head>
<body bgcolor="#FFF8DC">
Flight Details <br></br>
<body>
<s:form action="ModifyFlight">
<s:select list="nameAndId" headerValue="Choose Flight to modify" label="Choose The Flight" name="flightId"></s:select>
<s:submit value="Click to Modify"/>
</s:form>

</body>
</html>