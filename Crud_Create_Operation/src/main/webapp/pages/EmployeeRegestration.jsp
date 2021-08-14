<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Form</title>
</head>
<body>
<h1>Employee Registration Form </h1>
<f:form action="save" modelAttribute="emp" method="get">
<table border="1">



<tr>
<td> Name 		: <f:input path="name"/></td>
</tr>

<tr>
<td> Email 		: <f:input path="email"/></td>
</tr>

<tr>
<td> Department : <f:input  path="department"/></td>
</tr>

<tr>
<td> Salary 	: <f:input path="salary"/></td>
</tr>


<tr>
<td align="center"> <input  type="submit" value="save"/> </td>
</tr>

</table>
</f:form>
</body>
</html>