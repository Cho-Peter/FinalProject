<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>Add New Post</h1>
<form action="addok" method="post">
	<table>
		<tr><td>Worship:</td><td><input type="text" name="worship"/></td></tr>
		<tr><td>Worshiptime:</td><td><input type="text" name="worshiptime"/></td></tr>
		<tr><td>Writer:</td><td><input type="text" name="writer"/></td></tr>
		<tr><td>Student-Number:</td><td><input type="text" name="number"/></td></tr>
		<tr><td>Vaccine:</td><td><input type="text" name="vaccine"/></td></tr>
	</table>
	<button type="button" onclick="location.href='list'">목록보기</button>
	<button type="submit">등록하기</button>
</form>

</body>
</html>