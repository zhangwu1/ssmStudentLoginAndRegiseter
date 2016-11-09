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
<title>注册页面</title>
</head>
<body>

	<center>
		<h2>注册页面</h2>
		<form action="">
			<table>
				<tr>
					<td>学号<span style="color: red">*</span></td>
					<td><input type="text" name="studId" id="0"/></td>
				</tr>
				<tr>
					<td>姓名<span style="color: red">*</span></td>
					<td><input type="text" name="studName" id="1"/></td>
				</tr>
				<tr>
					<td>密码<span style="color: red">*</span></td>
					<td><input type="text" name="studPwd" id="2"/></td>
				</tr>
				<tr>
					<td>性别<span style="color: red">*</span></td>
					<td>
					  <input type="radio" name="studSex" value="m" checked="checked" />男
					  <input type="radio" name="studSex" value="w" />女
					</td>
				</tr>
				<tr>
					<td>地址<span style="color: red">*</span></td>
					<td><input type="text" name="studPlace" id="3"/></td>
				</tr>
				<tr>
					<td>手机号<span style="color: red">*</span></td>
					<td><input type="text" name="studPhone" id="4"/></td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" name="register"
						value="注册" /> <input type="reset" value="重置" /></td>
				</tr>
				<tr align="right">
					<td colspan="2"><a
						href="/StudentLoginAndRegiseter/studentController/login.do">退出</a></td>
				</tr>
			</table>
		</form>
	</center>
</body>
</html>