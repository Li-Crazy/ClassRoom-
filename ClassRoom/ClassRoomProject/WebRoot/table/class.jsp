<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

<title>班级详细</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">

<link rel="stylesheet" type="text/css" href="../css/table.css">


</head>

<body>

	<div id="Class">
		<table>
			<tr>
				<th>班级ID</th>
				<th>班级名称</th>
				<th>人数</th>
				<th>专业</th>
				<th>所属系</th>
			</tr>

			<tr>
				<td>${cls.classid}</td>
				<td>${cls.classname}</td>
				<td>${cls.amount}</td>
				<td>${cls.major}</td>
				<td>${cls.department}</td>

			</tr>
		</table>
	</div>
</body>
</html>
