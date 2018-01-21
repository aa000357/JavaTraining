<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=BIG5">
<title>Teacher</title>
</head>
<body>
	${Hello}
	
	<br>
	<form action="modify">
		<table border="1"  align="center">
		
		<tr>
			<td align="center"  colspan="5" >教師名單</td>
		</tr>
		
		<tr>
			<td>老師編號</td>
			<td>老師姓名</td>
			<td>老師性別</td>
			<td>修改</td>
			<td>刪除</td>
		</tr>
		
		<c:forEach items="${readList}" var="it">
		<tr>
			<td>${it.teacherId}</td>
			<td>${it.teacherName}</td>
			<td>${it.teacherGender}</td>
			<td><input type="submit" name="update" value="${it.teacherId}"></td>		
			<td><input type="submit" name="delete" value="${it.teacherId}"></td>
			
		</tr>
		</c:forEach>
		
		</table>
	</form>
	
		<center>
		<form action="saveList">
			<input type="submit" value="新增" >
		</form>
		</center>
</body>
</html>