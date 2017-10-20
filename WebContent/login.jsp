<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<meta http-equiv="Content-Style-Type" content="text/css" />
	<meta http-equiv="Content-Script-Type" content="text/javascript" />
	<meta http-equiv="imagetoolbar" content="no" />
	<meta name="description" content="" />
	<meta name="keywords" content="" />
	<meta charset="utf-8">
	<title>Login画面</title>
<!-- cssの設定・読み込み -->
<link rel="stylesheet" type="text/css" href="http://yui.yahooapis.com/3.18/build/cssreset/cssreset-min.css">
<link rel="stylesheet" type="text/css" href="css/user_main_design.css">
<style type="text/css">
		.formBox_login{
			width:360px;
			margin-left:auto;
			margin-right:auto;
			text-align:center;
			align:center;
		}

		table{
			height:120px;
			margin:0 auto;
			margin-top:50px;
			margin-bottom:50px;
			border:collapse:collapse;
			padding:0px;
			border:0px;
		}

		tr, td, th{
			border:0px;
		}
	</style>
</head>
<body>
<header>
</header>

<h1>ログイン画面</h1>

ユーザー情報を入力してください<br>
<small>Please input your user-infomation.</small>
<br>
(※ここべたうち：入力に誤りがあります）
<s:property value="errorMsg"/>



<div class="formBox_login">
<s:form action="LoginAction" theme="simple">
	<table>
		<tr>
			<td>ユーザーアドレス:</td><td><input type="text" name="mail_address"/></td>
		</tr>
		<tr>
			<td>パスワード:</td><td><input type="text" name="password"></td>
		</tr>
		<tr>
			<td colspan="2"><button class="actbtn" style="margin-left:160px">ログイン</button></td>
		</tr>
	</table>
</s:form>
</div>
<div style="height:85px"></div>
<footer>
</footer>
</body>
</html>