<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

<title>课程详情</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link rel="stylesheet" type="text/css" href="../css/table.css">


</head>

<body>

	<div id="Course">
		<table>
			<tr>
				<th>课程ID</th>
				<th>课程名称</th>
				<th>教师ID</th>
			</tr>

			<tr>
				<td>${course.courseid}</td>
				<td>${course.coursename}</td>

				<td><A
					href="../servlet/ShowTeacherServlet?teacherid=${course.teacherid}">${course.teacherid}</A>
				</td>
			</tr>
		</table>
	</div>
</body>
</html>
