<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>welcome!!!</title>
<style type="text/css">
div {
	position: absolute;
	width: 500px;
	height: 200px;
	left: 50%;
	top: 50%;
	margin-left: -250px;
	margin-top: -100px;
	border: solid 3px #ccc;
	z-index: 99;
}
</style>
</head>
<body>

<input id="register" name="register" type="submit" value="注册" />
	<div>
<!-- 		<form action="login?method=hello"> -->
		<form action="login/hello" method="post">
			<table>
				<tr>
					<td>用户名：</td>
					<td><input type="text" id="name" name="name" /></td>
				</tr>
				<tr>
					<td>密码：</td>
					<td><input type="password" id="password" name="password"/></td>
				</tr>
				<tr>
					<td><input type="submit" value="登录" /></td>
					<td><input type="button" value="注册" /></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>