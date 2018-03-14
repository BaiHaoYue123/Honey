<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html>
  <head>
    <base href="<%=basePath%>">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    
    <title>购物车详情</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<!--   <link rel="stylesheet" type="text/css" href="<%=basePath%>css/main.css">--> 
	<link href="assets/css/style.css" rel="stylesheet" type="text/css" />
	
	
  </head>
  
 
<body>
  <div class="wrap">
      <div class="ht_left">欢迎进入寻蜜人生！</div>
      <div class="ht_right"> <a href="/a/about/ppgs/">登录</a>|
        <a href="/a/server/lxwm/">注册</a>
        <a href="/a/server/lxwm/">给我留言</a>
    </div>
  </div>
  <div class="nav" id="nav">
    <div class=""></div>
    <div class="wrap"> <a class="logo" href="/"><img src="images/logo.jpg" width="215" height="50"/></a> 
      <div class="hshare"> <a href="#" class="icon_weibo"></a> <a href="#" class="icon_tengxun"></a> <a href="javascript:" class="icon_weixin"><img src="/skin/images/weixin_2.png"  /></a> </div>
      <a href="/" class="nav_home"><span></span></a>
      <div class="nav_con">
        <ul class="nav_list">
  
          <li><a href="/a/news/" class=""> 首页</a></li>
          
          <li><a href="changpinxiaoshou.html" class="">产品展厅</a></li>
          
          <li class="li4"><a href="/a/case/" class="" >热卖推荐</a></li> 
          <li class="li5"><a href="/a/zsjm/" class="" >个人中心</a></li>
          <li><a href="/a/job/" class="" >给我留言</a></li>
          <li><a href="/a/server/" class="" >关于我们</a></li>
          <div class="cls"></div>
        </ul>
      </div>
      </div>
</div>

      <ul>
      <div style="margin-top:35px;text-align: center;"  >
          <li><a>我的订单</a></a></li>
      </ul>
</head>
    <main>
	    <s:form action="order/order_queryOrders" method="post">
	        <div align="center">
	          <table width="425" height="206" align="center" >
	            <tr>  
	              <th height="79" style="font-size: 18px">序号</th>  
	              <th style="font-size: 18px">订单号</th>
	              <th style="font-size: 18px">蜂蜜</th>
	              <th style="font-size: 18px">单价</th> 
	              <th style="font-size: 18px">份数</th>  
	              <th style="font-size: 18px">总价</th>
                </tr> 
	            <tr class="success"></tr>
	            <s:iterator value="orderList" status="status">
	              <tr>
	                <td height="115"><s:property value="#status.index+1"></s:property></td>
	                <td><s:a href="order/order_showDetail?order.orderid=%{orderid}">
	                  <s:property value="orderid"></s:property></s:a>
                    </td>
	                <td><s:property value="honey.honeyname"></s:property></td>
	                <td><s:property value="honey.unitprice"></s:property></td>
	                <td><s:property value="honeynum"></s:property></td>
	                <td><s:property value="total"></s:property></td>
                  </tr>
                </s:iterator>
              </table>
          </div>
        </s:form>
	</main>
  </body>
</html>
  