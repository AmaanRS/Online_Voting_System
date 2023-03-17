<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<%@include file="./base.jsp"%>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/addVoter" class="container my-5 text-center"
		method="post">
		<h1>Add Voter</h1>
		<label for="voterName">Voter Name</label> <input
			name="voterName" placeholder="Enter Name" type="text"
			required="required">
			<label for="voterPassword">Voter Password</label> <input
			name="voterPassword" placeholder="Enter New Password" type="password"
			required="required">
		<div class="container ml-5 mt-4 text-center">
			<button class="btn btn-outline-success " type="submit">Submit</button>
		</div>
	</form>

</body>
</html>