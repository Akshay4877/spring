<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee page</title>
</head>
<body>

<h1>Employee List</h1>
<table width="100%" border="1">
	<tr>
		<th>emp_id</th>
		<th>emp_name</th>
		<th>emp_desg</th>
		<th>salary</th>
		<th colspan="2">Action</th>
	</tr>
	<c:forEach items="${listEmployee}" var="employee">
	<tr>
		<td>${employee.emp_id }</td>
			<td>${employee.emp_name }</td>
					<td>${employee.emp_desg }</td>
						<td>${employee.salary }</td>
					<td>
					<spring:url value="/update/${employee.emp_id}" var="updateURL "/>
					<a href="${updateURL}">Update</a>
					</td>
					<td>
					<spring:url value="/delete/${employee.emp_id}" var="deleteURL "/>
					<a href="${deleteURL}">Delete</a>
					</td>	
					
	</tr>
	 
</c:forEach>


</table>
</body>
</html>