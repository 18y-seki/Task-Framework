<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ログイン画面</title>
<link href="css/commons.css" rel="stylesheet">
</head>
<body>
	<p>${msg}</p>
	<form:form action="login" modelAttribute="form">
		<fieldset>
			<div>
				<label>ID</label>
				<form:input path="id" />
			</div>
			<div>
				<label>PASS</label>
				<form:password path="pass" />
			</div>
		</fieldset>
		<form:button>ログイン</form:button>
	</form:form>
<div>
  <a href="index">TOP画面へ</a>
</div>
</body>
</html>
