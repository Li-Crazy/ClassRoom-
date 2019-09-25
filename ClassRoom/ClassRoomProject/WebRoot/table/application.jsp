<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

<title>调课状况</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link rel="stylesheet" type="text/css" href="../css/table.css">


</head>

<body>
  <header><a href="../login/teacher_detail.jsp">返回上级</a></header>

	<div id="Application">
		<table>
			<tr>
				<th>教师ID</th>
				<th>课程ID</th>
				<th>教室ID</th>
				<th>调课后教室ID</th>
				<th>上课时间</th>
				<th>调课后上课时间</th>
			</tr>
			<tr>
				<td><A
					href="../servlet/ShowTeacherServlet?teacherid=${application.teacherid}">${application.teacherid}</A>
				</td>
				<td><A
					href="../servlet/ShowCourseServlet?courseid=${application.courseid}">${application.courseid}</A>
				</td>
				<td><A
					href="../servlet/ShowClassroomServlet?classroomid=${application.classroomid}">${application.classroomid}</A>
				</td>
				<td><A
					href="../servlet/ShowClassroomServlet?classroomid=${application.newclassroomid}">${application.newclassroomid}</A>
				</td>
				<td>${application.schooltime}</td>
				<td>${application.newschooltime}</td>
			</tr>
		</table>
	</div>
</body>
</html>
