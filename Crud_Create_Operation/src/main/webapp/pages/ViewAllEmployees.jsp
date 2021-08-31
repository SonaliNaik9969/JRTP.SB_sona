<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="j" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employees Details</title>
</head>
<body>
<h1> Employees Details </h1>
<table border="1">
<thead>
<th>id</th>
<th>name</th>
<th>email</th>
<th>department</th>
<th>salary</th>
<th>Action</th>
</thead>

<tbody>
<j:forEach items="${allEmployee }" var="emp">
<tr>
<td>${emp.id }</td>
<td>${emp.name }</td>
<td>${emp.email }</td>
<td>${emp.department }</td>
<td>${emp.salary }</td>
<td> <a href="/update/${emp.id}"> Edit </a> | <a href="/delete/${emp.id}"> Delete </a> </td>
</tr>
</j:forEach>
</tbody>
</table>
<br>
<a href="register"> Employee Registration Form </a> 
</body>
</html>