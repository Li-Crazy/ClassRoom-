<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

<title>课程操作</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link rel="stylesheet" type="text/css" href="../css/css.css">


</head>

<body>
  <header><a href="../login/admin_detail.jsp">返回上级</a></header>

	<div id="Course">
		<div>
			<h2>添加课程</h2>
			<form action="../servlet/ShowCourseServlet" method="get">
				课程号： <input type="text" name="courseid"> <br /> <br />
				教师号： <input type="text" name="teacherid"> <br /> <br />
				课程名称： <input type="text" name="coursename"> <br /> <br />
				添加<input type="radio" name="course" value="add" checked="checked">
				更改<input type="radio" name="course" value="update"> 删除<input
					type="radio" name="course" value="delete"><br /> <input
					type="submit" value="提交"> <input type="reset" value="重置">
			</form>
		</div>

	</div>
</body>
</html>
