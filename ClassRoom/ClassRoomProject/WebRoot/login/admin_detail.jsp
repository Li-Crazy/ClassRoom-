<%@ page language="java" contentType="text/html; charset=UTF-8"
	import='domain.*,dao.*,java.util.*'%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>



<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

<title>管理员界面</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">

<link rel="stylesheet" type="text/css" href="../css/admin.css">


</head>

<body>
	<header> <A href="..">退出登录</A> </header>

	<h2>${ad.adminname}&nbsp${sessionScope.info1}</h2>

	<div id="Admin">
		<article>
		<div>
			<h3>
				<A href="../servlet/ShowAdminServlet">查看详表</A>
			</h3><br/>
			<h3>
				<A href="../detail/schedule_detail.jsp">更改排课表</A>
			</h3><br/>
			<h3>
				<A href="../detail/class_detail.jsp">更改班级表</A>
			</h3><br/>
			<h3>
				<A href="../detail/classroom_detail.jsp">更改教室表</A>
			</h3><br/>
			<h3>
				<A href="../detail/course_detail.jsp">更改课程表</A>
			</h3><br/>
			<h3>
				<A href="../detail/teacher_detail.jsp">更改教师表</A>
			</h3><br/>
			<h3>
				<A href="../detail/student_detail.jsp">更改学生表</A>
			</h3>
		</div>
		</article>
		<aside>
		<div id="Schedule">

			<div id="Teacher">

				<form action="../servlet/ShowScheduleByTeacherAServlet" method="get">
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
					<c:forEach items="${schedule4}" var="schedule4">

						<tr>
							<td>${schedule4.scheduleid}</td>
							<td><A
								href="../servlet/ShowCourseServlet?courseid=${schedule4.courseid}">${schedule4.courseid}</A>
							</td>
							<td><A
								href="../servlet/ShowClassServlet?classid=${schedule4.classid}">${schedule4.classid}</A>
							</td>
							<td><A
								href="../servlet/ShowClassroomServlet?classroomid=${schedule4.classroomid}">${schedule4.classroomid}</A>
							</td>
							<td><A
								href="../servlet/ShowTeacherServlet?teacherid=${schedule4.teacherid}">${schedule4.teacherid}</A>
							</td>
							<td>${schedule4.schooltime}</td>
						</tr>
					</c:forEach>
				</table>
			</div>
			<br/>
			<div id="Class">

				<form action="../servlet/ShowScheduleByClassAServlet" method="get">
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
					<c:forEach items="${schedule5}" var="schedule5">

						<tr>
							<td>${schedule5.scheduleid}</td>
							<td><A
								href="../servlet/ShowCourseServlet?courseid=${schedule5.courseid}">${schedule5.courseid}</A>
							</td>
							<td><A
								href="../servlet/ShowClassServlet?classid=${schedule5.classid}">${schedule5.classid}</A>
							</td>
							<td><A
								href="../servlet/ShowClassroomServlet?classroomid=${schedule5.classroomid}">${schedule5.classroomid}</A>
							</td>
							<td><A
								href="../servlet/ShowTeacherServlet?teacherid=${schedule5.teacherid}">${schedule5.teacherid}</A>
							</td>
							<td>${schedule5.schooltime}</td>
						</tr>
					</c:forEach>
				</table>
			</div>
			<br/>
			<div id="Classroom">

				<form action="../servlet/ShowScheduleByClassroomAServlet"
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
					<c:forEach items="${schedule6}" var="schedule6">

						<tr>
							<td>${schedule6.scheduleid}</td>
							<td><A
								href="../servlet/ShowCourseServlet?courseid=${schedule6.courseid}">${schedule6.courseid}</A>
							</td>
							<td><A
								href="../servlet/ShowClassServlet?classid=${schedule6.classid}">${schedule6.classid}</A>
							</td>
							<td><A
								href="../servlet/ShowClassroomServlet?classroomid=${schedule6.classroomid}">${schedule6.classroomid}</A>
							</td>
							<td><A
								href="../servlet/ShowTeacherServlet?teacherid=${schedule6.teacherid}">${schedule6.teacherid}</A>
							</td>
							<td>${schedule6.schooltime}</td>
						</tr>
					</c:forEach>
				</table>
			</div>
			<br/>
			<div id="SchoolTime">

				<form action="../servlet/ShowScheduleBySchoolTimeAServlet"
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
					<c:forEach items="${schedule7}" var="schedule7">

						<tr>
							<td>${schedule7.scheduleid}</td>
							<td><A
								href="../servlet/ShowCourseServlet?courseid=${schedule7.courseid}">${schedule7.courseid}</A>
							</td>
							<td><A
								href="../servlet/ShowClassServlet?classid=${schedule7.classid}">${schedule7.classid}</A>
							</td>
							<td><A
								href="../servlet/ShowClassroomServlet?classroomid=${schedule7.classroomid}">${schedule7.classroomid}</A>
							</td>
							<td><A
								href="../servlet/ShowTeacherServlet?teacherid=${schedule7.teacherid}">${schedule7.teacherid}</A>
							</td>
							<td>${schedule7.schooltime}</td>
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
					<c:forEach items="${classroom1}" var="classroom1">

						<tr>
							<td>${classroom1.classroomid}</td>
							<td>${classroom1.amount}</td>
							<td>${classroom1.multimedia}</td>
						</tr>
					</c:forEach>
				</table>
			</div>
		</div>
		</aside>
	</div>
</body>
</html>
