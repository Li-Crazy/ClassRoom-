<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>表格详情</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
<link rel="stylesheet" type="text/css" href="../css/admin.css">


  </head>
  
  <body>
  <header><a href="../login/admin_detail.jsp">返回上级</a></header>
    <div id="Schedule">
		<h3>排课详情</h3>
			<table>
				<tr>
					<th>排课ID</th>
					<th>课程ID</th>
					<th>班级ID</th>
					<th>教室ID</th>
					<th>教师ID</th>
					<th>上课时间</th>
				</tr>

				<c:forEach items="${schedulea}" var="schedulea">
					<tr>
						<td>${schedulea.scheduleid}</td>
						<td><A
							href="../servlet/ShowCourseServlet?courseid=${schedulea.courseid}">${schedulea.courseid}</A>
						</td>
						<td><A
							href="../servlet/ShowClassServlet?classid=${schedulea.classid}">${schedulea.classid}</A>
						</td>
						<td><A
							href="../servlet/ShowClassroomServlet?classroomid=${schedulea.classroomid}">${schedulea.classroomid}</A>
						</td>
						<td><A
							href="../servlet/ShowTeacherServlet?teacherid=${schedulea.teacherid}">${schedulea.teacherid}</A>
						</td>
						<td>${schedulea.schooltime}</td>
					</tr>
				</c:forEach>
			</table>
		</div>

		<div id="Class">
		<h3>班级详情</h3>
			<table>
				<tr>
					<th>班级ID</th>
					<th>班级名称</th>
					<th>人数</th>
					<th>专业</th>
					<th>所属系</th>
				</tr>
				<c:forEach items="${cls}" var="cls">

					<tr>
						<td>${cls.classid}</td>
						<td>${cls.classname}</td>
						<td>${cls.amount}</td>
						<td>${cls.major}</td>
						<td>${cls.department}</td>

					</tr>
				</c:forEach>

			</table>
		</div>

		<div id="Classroom">
		<h3>教室详情</h3>
			<table>
				<tr>
					<th>教室ID</th>
					<th>人数</th>
					<th>多媒体</th>
				</tr>
				<c:forEach items="${classrooma}" var="classrooma">

					<tr>
						<td>${classrooma.classroomid}</td>
						<td>${classrooma.amount}</td>
						<td>${classrooma.multimedia}</td>
					</tr>
				</c:forEach>

			</table>
		</div>

		<div id="Course">
		<h3>课程详情</h3>
			<table>
				<tr>
					<th>课程ID</th>
					<th>课程名称</th>
					<th>教师ID</th>
				</tr>
				<c:forEach items="${course}" var="course">

					<tr>
						<td>${course.courseid}</td>
						<td>${course.coursename}</td>

						<td><A
							href="../servlet/ShowTeacherServlet?teacherid=${course.teacherid}">${course.teacherid}</A>
						</td>
					</tr>
				</c:forEach>


			</table>
		</div>

		<div id="Teacher">
		<h3>教师详情</h3>
			<table>
				<tr>
					<th>教师ID</th>
					<th>教师姓名</th>
					<th>所属系</th>
				</tr>
				<c:forEach items="${teacher}" var="teacher">

					<tr>
						<td>${teacher.teacherid}</td>
						<td>${teacher.teachername}</td>
						<td>${teacher.department}</td>
					</tr>
				</c:forEach>
			</table>
		</div>

		<div id="Student">
		<h3>学生详情</h3>
			<table>
				<tr>
					<th>学生ID</th>
					<th>学生姓名</th>
					<th>所属系</th>
				</tr>
				<c:forEach items="${student}" var="student">

					<tr>
						<td>${student.studentid}</td>
						<td>${student.studentname}</td>
						<td>${student.department}</td>
					</tr>
				</c:forEach>

			</table>
		</div>
		<div id="Application">
		<h3>申请调课</h3>
			<table>
				<tr>
					<th>教师ID</th>
					<th>课程ID</th>
					<th>教室ID</th>
					<th>调课后教室ID</th>
					<th>上课时间</th>
					<th>调课后上课时间</th>
				</tr>

				<c:forEach items="${application}" var="application">
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
				</c:forEach>

			</table>
		</div>
  </body>
</html>
