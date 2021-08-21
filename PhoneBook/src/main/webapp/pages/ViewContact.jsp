<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="j" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Contact Details</title>
</head>
<body>
<h1>Contact Details</h1>

<table border="2" >
<thead>
<th>id</th>
<th>name</th>
<th>email</th>
<th>mobile</th>
<th>Action</th>
</thead>

<tbody>
<j:forEach items="${allContact }" var="cont">
<tr>
<td>${cont.id }</td>
<td>${cont.name }</td>
<td>${cont.email }</td>
<td>${cont.mobile }</td>
<td> Edit |<a href="/delete/${cont.id}"> Delete </a> </td>
</tr>
</j:forEach>
</tbody>
</table>
</body>
</html>