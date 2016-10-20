<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>系统管理</title>
	<script src="<%=request.getContextPath()%>/js/jquery-3.1.0.min.js"></script>

	<link rel="stylesheet" href="<%=request.getContextPath()%>/Css/head.css"  type="text/css"/>
	<script src="<%=request.getContextPath()%>/js/head.js"></script>
</head>
<body style="background-color:#66AACC">

	<div class="logoheader large">
		<div class="inner">
			<h1><a href="Home.action"><img src="<%=request.getContextPath()%>/Image/logo.png" alt="logo"></a></h1>
			<ul class="nav">
				<li><a class="cur" href="Home.action" >首页</a></li>
				<li><a href="ClientUpdate.action" >客户端管理</a></li>
			</ul>
		</div>
	</div>
	
</body>
</html>