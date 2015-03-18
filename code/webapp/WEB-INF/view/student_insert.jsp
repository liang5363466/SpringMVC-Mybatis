<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
	
<!DOCTYPE>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>SMM整合示例</title>
	<link href="${webRoot }/resources/css/student_insert.css" rel="stylesheet" />
</head>
<body>
	<form action="${webRoot }/Student/Insert" method="post">
		<div class="control-group">
			<label for="stu.name">名字：</label> 
			<div class="controls">
				<input id="stu.name" name="stu.name" type="text">
			</div>
		</div>
		<div class="control-group">
			<label for="stu.password">密码：</label> 
			<div class="controls">
				<input id="stu.password" name="stu.password" type="password">
			</div>
		</div>
		<div class="control-group">
			<label for="stu.email">email：</label> 
			<div class="controls">
				<input id="stu.email" name="stu.email" type="text">
			</div>
		</div>
		<div class="control-group">
			<button>提交</button>
		</div>
	</form>
</body>
</html>