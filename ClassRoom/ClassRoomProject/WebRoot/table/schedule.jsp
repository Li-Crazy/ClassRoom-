<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

<title>排课表</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link rel="stylesheet" type="text/css" href="../css/table.css">


</head>

<body>

	<div id="Schedule">
		<table>
			<tr>
				<th>排课ID</th>
				<th>课程ID</th>
				<th>班级ID</th>
				<th>教室ID</th>
				<th>教师ID</th>
				<th>上课时间</th>
			</tr>
			<tr>
				<td>${schedule.scheduleid}</td>
				<td><A
					href="../servlet/ShowCourseServlet?courseid=${schedule.courseid}">${schedule.courseid}</A>
				</td>
				<td><A
					href="../servlet/ShowClassServlet?classid=${schedule.classid}">${schedule.classid}</A>
				</td>
				<td><A
					href="../servlet/ShowClassroomServlet?classroomid=${schedule.classroomid}">${schedule.classroomid}</A>
				</td>
				<td><A
					href="../servlet/ShowTeacherServlet?teacherid=${schedule.teacherid}">${schedule.teacherid}</A>
				</td>
				<td>${schedule.schooltime}</td>
			</tr>
		</table>
	</div>
</body>
</html>
