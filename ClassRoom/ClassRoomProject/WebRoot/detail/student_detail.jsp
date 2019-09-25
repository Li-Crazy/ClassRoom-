<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

<title>学生操作</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link rel="stylesheet" type="text/css" href="../css/css.css">


</head>

<body>
  <header><a href="../login/admin_detail.jsp">返回上级</a></header>

	<div id="Student">
		<div>
			<h2>添加学生</h2>
			<form action="../servlet/ShowStudentServlet" method="get">
				学号： <input type="text" name="studentid"> <br /> <br /> 密码：
				<input type="text" name="password"> <br /> <br /> 姓名： <input
					type="text" name="studentname"> <br /> <br /> 所属系： <input
					type="text" name="department"> <br /> <br /> 添加<input
					type="radio" name="student" value="add" checked="checked">
				更改<input type="radio" name="student" value="update"> 删除<input
					type="radio" name="student" value="delete"><br /> <input
					type="submit" value="提交"> <input type="reset" value="重置">
			</form>
		</div>

	</div>
</body>
</html>
