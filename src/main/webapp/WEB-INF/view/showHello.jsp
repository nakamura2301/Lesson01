<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>inputHello</title>
</head>
<body>

	結果です
	<% String message = (String) request.getAttribute("message"); %><br><br>
	<%= message %>

</body>
</html>
