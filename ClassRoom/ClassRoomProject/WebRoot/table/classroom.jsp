<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

<title>教室详情</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link rel="stylesheet" type="text/css" href="../css/table.css">

</head>

<body>

	<div id="Classroom">
		<table>
			<tr>
				<th>教室ID</th>
				<th>人数</th>
				<th>多媒体</th>
			</tr>

			<tr>
				<td>${classroom.classroomid}</td>
				<td>${classroom.amount}</td>
				<td>${classroom.multimedia}</td>
			</tr>
		</table>
	</div>
</body>
</html>
