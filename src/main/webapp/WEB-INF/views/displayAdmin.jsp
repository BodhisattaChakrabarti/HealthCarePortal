<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Administrator Details</title>
</head>
<body>

	<table border="1">
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Mobile</th>
		</tr>
		<tr>
			<td>${admin.id}</td>
			<td>${admin.name}</td>
			<td>${admin.mobile}</td>
		</tr>
	</table>

</body>
</html>