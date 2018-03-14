<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML>
<html xmlns="http://www.w3.org/1999/xhtml">
  <head>
    <base href="<%=basePath%>">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    
    <title>留言页面</title>
	<!-- <meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<meta http-equiv="Refresh" content="2;url=honey/honey_showHoney">-->
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<link href="assets/css/liuyan.css" rel="stylesheet" type="text/css" />
	
	<!-- <link rel="stylesheet" type="text/css" href="<%=basePath%>css/main.css"> -->
  </head>
  
  <body>
  <body>
	<h1>给我留言</h1>
	<div class="login-01">
    
			<form>
				<ul>
				<li class="first">
					<a href="#" class=" icon user"></a><input type="text" class="text" value="Name" onFocus="this.value = '';" onBlur="if (this.value == '') {this.value = 'Name';}" >
					<div class="clear"></div>
				</li>
				<li class="first">
					<a href="#" class=" icon email"></a><input type="text" class="text" value="Email" onFocus="this.value = '';" onBlur="if (this.value == '') {this.value = 'Email';}" >
					<div class="clear"></div>
				</li>
				<li class="first">
					<a href="#" class=" icon phone"></a><input type="text" class="text" value="Phone" onFocus="this.value = '';" onBlur="if (this.value == '') {this.value = 'Phone';}" >
					<div class="clear"></div>
				</li>
				<li class="second">
				<a href="#" class=" icon msg"></a><textarea value="Message" onFocus="this.value = '';" onBlur="if (this.value == '') {this.value = 'Comments';}">Comments</textarea>
				<div class="clear"></div>
				</li>
			</ul>
			<input type="submit" onClick="myFunction()" value="Submit" >
          
    
    
		</form>
</div>
</body>
</html>

</body>
</html>
  