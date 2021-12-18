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

<h1>Edit</h1>
<form action="../editok" method="post">
<input type="hidden" name="seq" value="${u.seq}"/>
<table id ="edit">
<tr><td>Worship:</td>
	<td>
	<input type="checkbox" id="worship0" name="worship" value="주일 영어예배">
	<label for="worship0">주일 영어예배</label><br>
	<input type="checkbox" id="worship1" name="worship" value="주일 한국어예배">
	<label for="worship1">주일 한국어예배</label><br>
	<input type="checkbox" id="worship2" name="worship" value="주일 저녁예배">
	<label for="worship2">주일 저녁예배</label><br>
	<input type="checkbox" id="worship3" name="worship" value="강물예배">
	<label for="worship3">강물예배</label>
</td></tr>
<tr><td>Worship-time:</td><td><input type="text" name="worshiptime" value="${u.worshiptime}"/></td></tr>
<tr><td>Writer:</td><td><input type="text" name="writer" value="${u.writer}"/></td></tr>
<tr><td>number:</td><td><input type="text" name="number" value="${u.number}" /></td></tr>
<tr><td>vaccine:</td>
	<td>
		<input type="radio" id="non" name="vaccine" value=미접종 />
		<label for="non">미접종</label><br>
		<input type="radio" id="first" name="vaccine" value="1차 접종" />
		<label for="first">1차 접종</label><br>
		<input type="radio" id="second" name="vaccine" value="2차 접종(14일 이내)" />
		<label for="second">2차 접종(14일 이내)</label><br>
		<input type="radio" id="finish" name="vaccine" value="2차 접종(14일 이후)" />
		<label for="finish">2차 접종(14일 이후)</label><br>
	</td></tr>
<tr><td colspan="2"><input type="submit" value="Edit Post"/>
<input type="button" value="Cancel" onclick="history.back()"/></td></tr>
</table>
</form>
</body>
</html>