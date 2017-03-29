<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>在线新闻系统</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
<link rel="stylesheet" href="./css/style.css" />
	<link href='http://fonts.googleapis.com/css?family=Oleo+Script' rel='stylesheet' type='text/css'>
<script type="text/javascript" src="./js/jquery.min.js"></script>
<script type="text/javascript" src="./js/login.js"></script>
<script>var base="<%=basePath%>";</script>
  </head>
  
  <body>
 <div class="lg-container">
		<h1>管理员登录</h1>
		<form id="lg-form" name="lg-form" method="post"  onsubmit="return false">
			

			<div>
				
				<input type="text" name="username" id="id" placeholder="用户名"/>
			</div>
			
			<div>
				
				<input type="password" name="password" id="pwd" placeholder="密码" />
			</div>

			<div>				
				<button type="submit" id="login">登录</button>
			</div>
			
		</form>
		<div id="message"></div>
	</div>
  </body>
</html>
