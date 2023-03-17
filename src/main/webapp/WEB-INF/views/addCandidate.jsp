<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<%@include file="./base.jsp"%>
<meta charset="UTF-8">
<title>Add Candidate</title>
</head>
<body>
	<form action="/addCandidate" class="container my-5 text-center" method="post">
		<h1>Add Candidate</h1>
		<label for="candidateName">Candidate Name</label> <input
			name="candidateName" placeholder="Enter Name"
			type="text" required="required">
			<div class="container ml-5 mt-4 text-center">
		<button class="btn btn-outline-success " type="submit">Submit</button>
		</div>
	</form>
</body>
</html>