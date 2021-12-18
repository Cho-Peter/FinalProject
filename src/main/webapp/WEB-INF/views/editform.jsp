<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
 <%@page import="com.my.myapp.worship.WorshipDAO, com.my.myapp.worship.WorshipVO"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title>Edit Form</title>
</head>
<body>

<h1>Edit Form</h1>
<form action="../editok" method="post">
<input type="hidden" name="seq" value="${u.seq}"/>
<table id ="edit">
<tr><td>Worship:</td><td><input type="text" name="worship" value="${u.worship}"/></td></tr>
<tr><td>Worship-time:</td><td><input type="text" name="worshiptime" value="${u.worshiptime}"/></td></tr>
<tr><td>Writer:</td><td><input type="text" name="writer" value="${u.writer}"/></td></tr>
<tr><td>number:</td><td><input type="text" name="number" value="${u.number}" /></td></tr>
<tr><td>vaccine:</td><td><input type="text" name="vaccine" value="${u.vaccine}"/></td></tr>
<tr><td colspan="2"><input type="submit" value="Edit Post"/>
<input type="button" value="Cancel" onclick="history.back()"/></td></tr>
</table>
</form>
</body>
</html>