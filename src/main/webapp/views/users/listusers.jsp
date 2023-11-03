<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:if test="${message!=null}">
		<span>${message}</span>
	</c:if>
	<c:if test="${error!=null}">
		<span>${error}</span>
	</c:if>
	<table border="1" style="width:100%">
		<thead>
			 <tr>
			 <th>Username</th>
			 <th>Password</th>
			 <th>Phone</th>
			 <th>Action</th>
			 </tr>
		</thead>
		<tbody>
		<c:forEach var= "i" items= "${listusers}">
			<tr>
				<td>${i.username}</td>
				<td>${i.password}</td>
				<td>${i.phone}</td>
				<td><a href="update?id=${i.username}">Update</a> || <a href="delete?id=${i.username}"> Delete</a></td>
			</tr>
		</c:forEach>
		</tbody>
	</table>
		<br>
		
	
</body>
</html>