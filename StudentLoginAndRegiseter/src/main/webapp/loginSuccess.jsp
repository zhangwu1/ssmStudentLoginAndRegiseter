<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录成功</title>
</head>
<body>
	<center>
		<table border="1">
			<tr>
				<td>学号：</td>
				<td>${student.studid }</td>
			</tr>
			<tr>
				<td>姓名：</td>
				<td>${student.studname }</td>
			</tr>
			<tr>
				<td>密码：</td>
				<td>${student.studpwd }</td>
			</tr>
			<tr>
				<td>性别：</td>
				<td>${student.studsex }</td>
			</tr>
			<tr>
				<td>地址：</td>
				<td>${student.studplace }</td>
			</tr>
			<tr>
				<td>手机号码：</td>
				<td>${student.studphone }</td>
			</tr>
			<tr align="right">
				<td colspan="2"><a href="/StudentLoginAndRegiseter/studentController/login.do">退出</a></td>
			</tr>
		</table>
	</center>
</body>
</html>