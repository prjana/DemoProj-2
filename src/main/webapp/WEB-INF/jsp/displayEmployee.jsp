<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome to Spring boot application</title>
</head>
<body>
  <h1> List of all employees </h1>
</body>

<c:forEach items="${employeeList}" var="employee">
 <tr> <td>${employee.employeeId}</td></tr>
  <tr>	<td>${employee.employeeName}</td></tr>
  <tr>	<td>${employee.employeeEmail}</td></tr>
  <tr>	<td>${employee.employeeLocation}</td></tr>
</c:forEach>
</html>