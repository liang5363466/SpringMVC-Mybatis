<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@include file="top.jsp" %>
<!DOCTYPE>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>SMM整合示例</title>
	<link href="${webRoot }/resources/css/student_list.css" rel="stylesheet" />
</head>
<body>
	<table class="bordered">
		<thead>
			<tr>
				<th colspan="5">
					<a id="btnStuAdd" href="#">添加新学生</a>
				</th>
			</tr>
			<tr>
				<th>姓名</th>
				<th>密码</th>
				<th>邮箱</th>
				<th>班级</th>
				<th>操作</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="item" items="${model}">
				<tr>
					<td>${item.NAME }</td>
					<td>${item.PASSWORD }</td>
					<td>${item.EMAIL }</td>
					<td>${item.CLASS_NAME }</td>
					<td><a class="stu_edit" stuid="${item.ID }" href="${webRoot }/User/Edit">编辑</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
<script src="${webRoot }/resources/js_shared/jquery.js"></script>
<script src="${webRoot }/resources/js/user_list.js"></script>
</html>