<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<%@include file="./base.jsp"%>
<meta charset="UTF-8">
<title>Update Candidate</title>
</head>
<body>
	<form action="/update/${candidate.candidateId}" class="container my-5 text-center" >
		<h1>Update Candidate</h1>
		<label for="candidateName">Candidate Name</label> 
		<input
			name="candidateName" placeholder="${candidate.candidateName}"
			type="text" required="required">
			<div class="container ml-5 mt-4 text-center">
		<button class="btn btn-outline-success " type="submit">Submit</button>
		</div>
	</form>
</body>
</html>