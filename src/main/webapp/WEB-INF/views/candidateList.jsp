<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<%@include file="./base.jsp"%>
<%@include file="./navBar.jsp"%>

<meta charset="UTF-8">
<title>Admin Page</title>
</head>
<body>

	<form action="/addCandidatePage" class="container text-center" >
		<div class="table-responsive">
			<table class="table table-hover">
				<thead>
					<tr>
						<th scope="col">Id</th>
						<th scope="col">Candidate Name</th>
						<th scope="col">Action</th>
					</tr>
				</thead>
				<c:forEach items="${candidates}" var="p">
					<tbody>
						<tr>

							<td>${p.candidateId}</td>
							<td>${p.candidateName}</td>
							<td><a href="/delete/${p.candidateId}"><i class="fas fa-trash" style="font-size: 20px"></i></a> 
								<a href="/updatePage/${p.candidateId}"><i class="fas fa-pen-nib" style="font-size: 20px"></i></a>
							</td>
						</tr>
					</tbody>
				</c:forEach>
			</table>
		</div>
		<button class="btn btn-outline-success" type="submit">Add Candidate</button>
	</form>


</body>
</html>