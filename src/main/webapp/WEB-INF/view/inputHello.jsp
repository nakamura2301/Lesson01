<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>inputHello</title>
</head>
<body>

	メッセージ
	<form action="<%= request.getContextPath() %>/hello" method="post" >
		<input type="text" name="message" >
		<input type="submit" name="submit" value="送信" >
	</form>

</body>
</html>