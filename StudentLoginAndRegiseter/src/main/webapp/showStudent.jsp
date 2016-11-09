<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript"
	src="${pageContext.request.contextPath }/content/js/jquery-1.7.2.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath }/content/js/loginAjx.js"></script>
<title>学生登录</title>
</head>
<body>

	<center>
		<br /> <br /> <br /> <br />
		<table align="center" border="0" cellpadding="0" cellspacing="0">
			<tr align="center">
				<td colspan="2">学生登录</td>
			</tr>
			<tr align="center">
				<td>学号</td>
				<td><input type="text" name="studName" id="studName"/></td>
			</tr>
			<tr align="center">
				<td>密码</td>
				<td><input type="password" name="studPassword" id="studPassword"/></td>
			</tr>
		</table><br />
		<input type="submit" value="登录" id="submit" />
		<input type="reset" value="重置" /><p/>
		<a href="/StudentLoginAndRegiseter/studentController/registerNewStudent.do">注册</a>
	</center>

</body>
</html>