<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

<title>排课操作</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link rel="stylesheet" type="text/css" href="../css/css.css">


</head>

<body>
  <header><a href="../login/admin_detail.jsp">返回上级</a></header>

	<div id="Schedule">
		<div>
			<h2>添加排课</h2>
			<form action="../servlet/ShowScheduleServlet" method="get">
				排课号： <input type="text" name="scheduleid"> <br /> <br />
				课程号： <input type="text" name="courseid"> <br /> <br />
				教室号： <input type="text" name="classroomid"> <br /> <br />
				班级号： <input type="text" name="classid"> <br /> <br /> 教师号：<input
					type="text" name="teacherid"> <br /> <br /> 上课时间：<input
					type="text" name="schooltime"> <br /> <br /> 添加<input
					type="radio" name="schedule" value="add" checked="checked">
				更改<input type="radio" name="schedule" value="update"> 删除<input
					type="radio" name="schedule" value="delete"><br /> <input
					type="submit" value="提交"> <input type="reset" value="重置">
			</form>
		</div>
	</div>
</body>
</html>
