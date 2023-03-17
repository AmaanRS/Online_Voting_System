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

	<form action="/addVoterPage" class="container text-center">
		<div class="table-responsive">
			<table class="table table-hover">
				<thead>
					<tr>
						<th scope="col">Id</th>
						<th scope="col">Voter Name</th>
						<th scope="col">Voter Password</th>
						<th scope="col">Action</th>
					</tr>
				</thead>
				<c:forEach items="${voters}" var="p">
					<tbody>
						<tr>

							<td>${p.voterId}</td>
							<td>${p.voterName}</td>
							<td>${p.voterPassword}</td>
							<td><a href="/deleteVoter/${p.voterId}"><i
									class="fas fa-trash" style="font-size: 20px"></i></a> <a
								href="/updateVoterPage/${p.voterId}"><i
									class="fas fa-pen-nib" style="font-size: 20px"></i></a></td>
						</tr>
					</tbody>
				</c:forEach>
			</table>
		</div>
		<button class="btn btn-outline-success" type="submit">Add Voter</button>
	</form>



</body>
</html>