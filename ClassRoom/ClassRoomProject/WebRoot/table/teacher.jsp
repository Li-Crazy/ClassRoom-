<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

<title>教师详情</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link rel="stylesheet" type="text/css" href="../css/table.css">


</head>

<body>

	<div id="Teacher">
		<table>
			<tr>
				<th>教师ID</th>
				<th>教师姓名</th>
				<th>所属系</th>
			</tr>

			<tr>
				<td>${teacher.teacherid}</td>
				<td>${teacher.teachername}</td>
				<td>${teacher.department}</td>
			</tr>
		</table>
	</div>
</body>
</html>
