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
</head>

<body>
<header>
<!-- ログイン中 -->
<s:if test="session.get('loginInfo') != null">
<table style="margin:0 auto; width:640px; color:lightyellow; padding:40px; padding-top:5px;">
<tr>
<th style="font-size:20px">TOP</th><th>ようこそ<s:property value="user_name"/>さん</th><th style="width:50px"></th><th>ABOUT</th><th>MY PAGE</th><th>CART</th><th>LOGOUT</th>
</tr>
</table>
</s:if>
<!-- ログアウト中（ゲストさん用） -->
<s:else>
<table style="margin:0 auto; width:640px; color:lightyellow; padding:40px; padding-top:5px;">
<tr>
<th style="font-size:20px">TOP</th><th style="width:50px"></th><th>ABOUT</th><th>LOGIN</th><th>CREATE ACCOUNT</th>
</tr>
</table>
</s:else>
</header>

</body>
</html>