<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head><%@include file="./base.jsp"%>
<!-- <script type="text/javascript">
	function preventBack() {
		window.history.forward();
	}
	setTimeout("preventBack()", 0);
	window.onunload = function() {
		null
	};
</script> -->
</head>
<body>
	<form action="/adminLogin" class="container-fluid">
		<button class="btn btn-primary" type="submit">Login</button>
	</form>
</body>
</html>
