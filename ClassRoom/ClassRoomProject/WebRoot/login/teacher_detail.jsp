<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

<title>教师界面</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">

<link rel="stylesheet" type="text/css" href="../css/teacher.css">


</head>

<body>
	<header> <A href="..">退出登录</A></header>
	<div id="Content">
		<article>
		<h2>课程查询</h2>
		<h3>${teacher.teachername}&nbsp${sessionScope.info1}</h3>
		<br />
		<div id="Schedule">

			<div id="Teacher">

				<form action="../servlet/ShowScheduleByTeacherServlet" method="get">
					教师号： <input type="text" name="teacherid"> <input
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

					<c:forEach items="${schedulet}" var="schedulet">
						<tr>
							<td>${schedulet.scheduleid}</td>
							<td><A
								href="../servlet/ShowCourseServlet?courseid=${schedulet.courseid}">${schedulet.courseid}</A>
							</td>
							<td><A
								href="../servlet/ShowClassServlet?classid=${schedulet.classid}">${schedulet.classid}</A>
							</td>
							<td><A
								href="../servlet/ShowClassroomServlet?classroomid=${schedulet.classroomid}">${schedulet.classroomid}</A>
							</td>
							<td><A
								href="../servlet/ShowTeacherServlet?teacherid=${schedulet.teacherid}">${schedulet.teacherid}</A>
							</td>
							<td>${schedulet.schooltime}</td>
						</tr>
					</c:forEach>
				</table>
			</div>
			<br />
			<div id="Class">

				<form action="../servlet/ShowScheduleByClassTServlet" method="get">
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

					<c:forEach items="${schedule1t}" var="schedule1t">
						<tr>
							<td>${schedule1t.scheduleid}</td>
							<td><A
								href="../servlet/ShowCourseServlet?courseid=${schedule1t.courseid}">${schedule1t.courseid}</A>
							</td>
							<td><A
								href="../servlet/ShowClassServlet?classid=${schedule1t.classid}">${schedule1t.classid}</A>
							</td>
							<td><A
								href="../servlet/ShowClassroomServlet?classroomid=${schedule1t.classroomid}">${schedule1t.classroomid}</A>
							</td>
							<td><A
								href="../servlet/ShowTeacherServlet?teacherid=${schedule1t.teacherid}">${schedule1t.teacherid}</A>
							</td>
							<td>${schedule1t.schooltime}</td>
						</tr>
					</c:forEach>
				</table>
			</div>
			<br />
			<div id="Classroom">

				<form action="../servlet/ShowScheduleByClassroomTServlet"
					method="get">
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

					<c:forEach items="${schedule2t}" var="schedule2t">
						<tr>
							<td>${schedule2t.scheduleid}</td>
							<td><A
								href="../servlet/ShowCourseServlet?courseid=${schedule2t.courseid}">${schedule2t.courseid}</A>
							</td>
							<td><A
								href="../servlet/ShowClassServlet?classid=${schedule2t.classid}">${schedule2t.classid}</A>
							</td>
							<td><A
								href="../servlet/ShowClassroomServlet?classroomid=${schedule2t.classroomid}">${schedule2t.classroomid}</A>
							</td>
							<td><A
								href="../servlet/ShowTeacherServlet?teacherid=${schedule2t.teacherid}">${schedule2t.teacherid}</A>
							</td>
							<td>${schedule2t.schooltime}</td>
						</tr>
					</c:forEach>
				</table>
			</div>
			<br />
			<div id="SchoolTime">

				<form action="../servlet/ShowScheduleBySchoolTimeTServlet"
					method="get">
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

					<c:forEach items="${schedule3t}" var="schedule3t">
						<tr>
							<td>${schedule3t.scheduleid}</td>
							<td><A
								href="../servlet/ShowCourseServlet?courseid=${schedule3t.courseid}">${schedule3t.courseid}</A>
							</td>
							<td><A
								href="../servlet/ShowClassServlet?classid=${schedule3t.classid}">${schedule3t.classid}</A>
							</td>
							<td><A
								href="../servlet/ShowClassroomServlet?classroomid=${schedule3t.classroomid}">${schedule3t.classroomid}</A>
							</td>
							<td><A
								href="../servlet/ShowTeacherServlet?teacherid=${schedule3t.teacherid}">${schedule3t.teacherid}</A>
							</td>
							<td>${schedule3t.schooltime}</td>
						</tr>
					</c:forEach>
				</table>
			</div>
			<div id="Classroom1">
				<h3>空教室</h3>
				<table>
					<tr>
						<th>教室ID</th>
						<th>人数</th>
						<th>多媒体</th>
					</tr>
					<c:forEach items="${classroomt}" var="classroomt">

						<tr>
							<td>${classroomt.classroomid}</td>
							<td>${classroomt.amount}</td>
							<td>${classroomt.multimedia}</td>
						</tr>
					</c:forEach>
				</table>
			</div>
		</div>
	</div>
	</article>
	<aside>
	<div>
		<h2>调课申请</h2>
		<form action="../servlet/ShowApplicationServlet" method="get">
			课程号： <input type="text" name="courseid"> <br /> <br /> 教师号：
			<input type="text" name="teacherid"> <br /> <br /> 原上课时间： <input
				type="text" name="schooltime"> <br /> <br /> 调整时间： <input
				type="text" name="newschooltime"> <br /> <br /> 原教室：<input
				type="text" name="classroom"> <br /> <br />调整教室：<input
				type="text" name="newclassroom"> <br /> <br /> <input
				type="submit" value="提交">
		</form>
	</div>
	</aside>
	</div>

</body>
</html>
