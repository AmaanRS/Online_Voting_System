<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<%@include file="./base.jsp"%>
<meta charset="UTF-8">
<title>Admin Login</title>
</head>
<body>
	<form action="/dashboard" class="container mt-5 my-5" method="post">
		<div class="form-group">
			<label for="adminId">Id</label> <input type="number"
				class="form-control" id="adminId" name="adminId"
				placeholder="Enter Id" required="required">
		</div>
		<div class="form-group">
			<label for="adminPassword">Password</label> <input type="password"
				class="form-control" id="adminPassword" name="adminPassword"
				placeholder="Password" required="required">
		</div>
		</div>
		<button type="submit" class="btn btn-primary">Submit</button>
	</form>
</body>
</html>