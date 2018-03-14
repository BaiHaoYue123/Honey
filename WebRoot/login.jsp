
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
  <head>
    <title>登录页面</title>
    <meta charset="utf-8">
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
    <meta name="description" content="Flat UI Kit Free is a Twitter Bootstrap Framework design and Theme, this responsive framework includes a PSD and HTML version."/>

    <meta name="viewport" content="width=1000, initial-scale=1.0, maximum-scale=1.0">

    <!-- Loading Bootstrap -->
    <link href="dist/css/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- Loading Flat UI -->
    <link href="dist/css/flat-ui.css" rel="stylesheet">
    <link href="docs/assets/css/demo.css" rel="stylesheet">

    <link rel="shortcut icon" href="img/favicon.ico">
</head>
  
  
  <body>
  <div class="login">
        <div class="login-screen">
          <div class="login-icon">
            <img src="login/icon.png" alt="Welcome to honey web" />
            <h4>Welcome to <small>Honey Web</small></h4>
          </div>

          <div class="login-form">
            <div class="form-group">
             <s:form action="customer/customer_login" method="post">
              <s:textfield name="customer.name" label="用户名"></s:textfield>
      <s:password name="customer.password" label="密码"></s:password>
      <s:submit value="登录"></s:submit>
    </s:form>
    <br>
              <input type="text" class="form-control login-field" value="" placeholder="请输入你的用户名" id="login-name" />
              <label class="login-field-icon fui-user" for="login-name"></label>
            </div>

            <div class="form-group">
              <input type="password" class="form-control login-field" value="" placeholder="密码" id="login-pass" />
              <label class="login-field-icon fui-lock" for="login-pass"></label>
            </div>

            <a class="btn btn-primary btn-lg btn-block" href="#">提交</a>
            <a class="login-link" href="#">记不住密码?</a>
          </div>
      <form action="form_action.html" method="get">       
</form>  
    </div>
 

  </body>
</html>
