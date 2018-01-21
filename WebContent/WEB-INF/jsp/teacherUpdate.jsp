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
	<form action="update">
		<table border="1"  align="center">
		
		<tr>
			<td align="center"  colspan="5" >修改老師資料</td>
		</tr>
		
		<tr>
			<td>老師編號</td>
			<td>老師姓名</td>
			<td>老師性別</td>
			<td>取消</td>
			<td>確定</td>
		</tr>
		

		<tr>
			<td>${updateList.teacherId}</td>
			<td><input type="text" name="teacherName" value="${updateList.teacherName}"></td>
			<td><input type="text" name="teacherGender" value="${updateList.teacherGender}"></td>
			<td><input type="submit" name="cancel" value="取消"></td>		
			<td><input type="submit" name="enter" value="${updateList.teacherId}"></td>
			
		</tr>

		
		</table>
	</form>
	
		
</body>
</html>