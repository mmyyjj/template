<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- cssの設定・読み込み -->
<link rel="stylesheet" type="text/css" href="http://yui.yahooapis.com/3.18/build/cssreset/cssreset-min.css">
<link rel="stylesheet" type="text/css" href="css/user_main_design.css">
<style type="text/css">
		a{
			color:lightyellow;
		}
</style>

</head>

<body>
<header>
<!-- ログイン中 -->
<s:if test="session.get('user_id') != null">
<table style="margin:0 auto; width:640px; height:24px; color:lightyellow; padding:40px; padding-top:5px;">
<tr>
<th style="font-size:20px">
<a href="GoItemListPageAction">TOP</a>
</th>
<th>ようこそ<s:property value='session.get("user_name")'/>さん</th>
<th style="width:50px"></th>
<th>
<a href="GoAboutPageAction">ABOUT</a>
</th>
<th>
<a href="GoMyPageAction">MY PAGE</a>
</th>
<th>
<a href="GoCartAction">CART</a>
</th>

<th>
  <a href="LogoutAction">LOGOUT</a>
</th>
</tr>
</table>
</s:if>





<!-- ログアウト中（ゲストさん用） -->
<s:else>
<table style="margin:0 auto; width:640px; color:lightyellow; padding:40px; padding-top:5px;">
<tr>
<th style="font-size:20px">
<a href="GoItemListPageAction">TOP</a>
</th>
<th style="width:50px"></th>
<th><a href="GoAboutPageAction">ABOUT</a></th>
<th>LOGIN</th>
<th>CREATE ACCOUNT</th>
</tr>
</table>
</s:else>
</header>

</body>
</html>