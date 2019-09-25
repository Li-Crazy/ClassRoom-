<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

<title>教室调度查询系统</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link rel="stylesheet" type="text/css" href="./css/Main.css">
</head>

<body>
	<h2>欢迎来到教室调度查询系统</h2>
	<br/>
	<h3>${sessionScope.info}</h3>
	<div id="Login">
		<form action="./servlet/LoginServlet" method="post">
			用户名：<input type="text" name="name"><br /> 密码：<input
				type="password" name="password1"><br /> 学生<input
				type="radio" name="user" value="student" checked="checked">
			教师<input type="radio" name="user" value="teacher"> 管理员<input
				type="radio" name="user" value="admin"><br /> <input
				type="submit" value="提交"> <input type="reset" value="重置">
		</form>
	</div>
	<footer>
		<section clospan="6" align="center">
			山东科技大学教务中心&nbsp;&nbsp;版权所有<br> <address>地址：山东省泰安市岱岳区凤凰路 联系电话：025-63335653<br></address>
		</section>
	</footer>
	<br>
</body>
</html>
