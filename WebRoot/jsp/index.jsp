<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>新闻系统</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" type="text/css" href="<%=basePath %>/css/themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="<%=basePath %>/css/themes/icon.css">
	<link rel="stylesheet" type="text/css" href="<%=basePath %>/css/demo.css">
	<script type="text/javascript" src="<%=basePath %>/js/jquery.min.js"></script>
	<script type="text/javascript" src="<%=basePath %>/js/jquery.easyui.min.js"></script>
	<script type="text/javascript" src="<%=basePath%>/js/Tree.js"></script>
	<script type="text/javascript" src="<%=basePath%>/js/Taps.js"></script>
	
  </head>
  
 <body class="easyui-layout">
	<div data-options="region:'north',border:false" style="height:60px;background:#666;padding:10px">
		<div id = "logo" class = "logo"></div>
	<div class="logout"></div>
	</div>
	<div data-options="region:'west',split:true,title:'系统菜单'" style="width:180px;padding:10px;">
		<ul id="tree1" class="easyui-tree"></ul>	
	</div>
	
	<div data-options="region:'south',border:false" style="height:50px;background:#A9FACD;padding:10px;">south region</div>
	<div data-options="region:'center'">
	<div id = "tabs" >
		<div title="起始页" style="display:block">
		
		</div>
	</div>
	</div>
</body>
</html>
