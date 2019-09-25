<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

<title>学生界面</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">

<link rel="stylesheet" type="text/css" href="../css/student.css">


</head>

<body>
	<header> <A href="..">退出登录</A></header>

	<h2>教室查询</h2>
	<h3>${student.studentname}&nbsp${sessionScope.info1}</h3>
	<br />
	<div id="Class">
		<form action="../servlet/ShowScheduleByClassServlet" method="get">
			班级： <input type="text" name="classid"> <input type="submit"
				value="查询">
		</form>
		<h3>排课情况</h3>
		<table>
			<tr>
				<th>排课ID</th>
				<th>课程ID</th>
				<th>班级ID</th>
				<th>教室ID</th>
				<th>教师ID</th>
				<th>上课时间</th>
			</tr>

			<c:forEach items="${schedule}" var="schedule">
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
			</c:forEach>
		</table>
	</div>
	<br />
	<div id="Classroom">
		<form action="../servlet/ShowScheduleByClassroomServlet" method="get">
			教室： <input type="text" name="classroomid"> <input
				type="submit" value="查询">
		</form>
		<h3>排课情况</h3>
		<table>
			<tr>
				<th>排课ID</th>
				<th>课程ID</th>
				<th>班级ID</th>
				<th>教室ID</th>
				<th>教师ID</th>
				<th>上课时间</th>
			</tr>

			<c:forEach items="${schedule1}" var="schedule1">
				<tr>
					<td>${schedule1.scheduleid}</td>
					<td><A
						href="../servlet/ShowCourseServlet?courseid=${schedule1.courseid}">${schedule1.courseid}</A>
					</td>
					<td><A
						href="../servlet/ShowClassServlet?classid=${schedule1.classid}">${schedule1.classid}</A>
					</td>
					<td><A
						href="../servlet/ShowClassroomServlet?classroomid=${schedule1.classroomid}">${schedule1.classroomid}</A>
					</td>
					<td><A
						href="../servlet/ShowTeacherServlet?teacherid=${schedule1.teacherid}">${schedule1.teacherid}</A>
					</td>
					<td>${schedule1.schooltime}</td>
				</tr>
			</c:forEach>
		</table>
	</div>
	<br />
	<div id="SchoolTime">
		<form action="../servlet/ShowScheduleBySchoolTimeServlet" method="get">
			上课时间： <input type="text" name="schooltime"> <input
				type="submit" value="查询">
		</form>
		<h3>排课情况</h3>
		<table>
			<tr>
				<th>排课ID</th>
				<th>课程ID</th>
				<th>班级ID</th>
				<th>教室ID</th>
				<th>教师ID</th>
				<th>上课时间</th>
			</tr>

			<c:forEach items="${schedule2}" var="schedule2">
				<tr>
					<td>${schedule2.scheduleid}</td>
					<td><A
						href="../servlet/ShowCourseServlet?courseid=${schedule2.courseid}">${schedule2.courseid}</A>
					</td>
					<td><A
						href="../servlet/ShowClassServlet?classid=${schedule2.classid}">${schedule2.classid}</A>
					</td>
					<td><A
						href="../servlet/ShowClassroomServlet?classroomid=${schedule2.classroomid}">${schedule2.classroomid}</A>
					</td>
					<td><A
						href="../servlet/ShowTeacherServlet?teacherid=${schedule2.teacherid}">${schedule2.teacherid}</A>
					</td>
					<td>${schedule2.schooltime}</td>
				</tr>
			</c:forEach>
		</table>
	</div>
	<br />
	<div id="Classroom1">
		<h3>空教室</h3>
		<table>
			<tr>
				<th>教室ID</th>
				<th>人数</th>
				<th>多媒体</th>
			</tr>
			<c:forEach items="${classroom}" var="classroom">

				<tr>
					<td>${classroom.classroomid}</td>
					<td>${classroom.amount}</td>
					<td>${classroom.multimedia}</td>
				</tr>
			</c:forEach>
		</table>
</body>
</html>
