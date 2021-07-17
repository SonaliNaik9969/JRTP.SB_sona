<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> student jsp page</title>
</head>
<body>
<h1> Student Registration Form </h1>
<f:form action="save" modelAttribute="student" method="post">
<table border="1">

<tr>
<td> Name 		: <input type="text"/></td>
</tr>

<tr>
<td> Address 	    : <input type="text"/></td>
</tr>

<tr>
<td> Email 		: <input  type="text"/></td>
</tr>

<tr>
<td> Contact 	    : <input type="number" /></td>
</tr>

<tr>
<td> DOB          : <input  type="date"/></td>
</tr>
<tr>

<td> Education 	: <input type="checkbox" />SSC  
				      <input  type="checkbox" />HSC 
				      <input  type="checkbox" />Graduation  
				      <input  type="checkbox" />Post-Graduation
</td>
</tr>

<tr>
<td align="center"> <input  type="submit" value="save"/> </td>
</tr>

</table>
</f:form>

</body>
</html>