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
<style type="text/css">

		body {
			margin:0;
			padding:0;
			background-color:#fff3b8;
			color:#5f6527;
			font-family:メイリオ;
			font-size:12px;
			text-align:center;
		}

		h1 {
			text-align:center;
			margin-top:50px;
			margin-right:0 auto;
			margin-left:0 auto;
		}

		button.actbtn {
			float:left;
			width:120px;
			height:40px;
			background-color:#7b8d42;
			color:#fff3b8;
			border-style:none;
			-moz-border-radius: 5px;
			-webkit-borderus: 5px;
			border-radius:5px;
		}

		button.actbtn:hover {
			float:left;
			width:120px;
			height:40px;
			background-color:#9fc24b;
			color:#fff3b8;
			border-style:none;
			-moz-border-radius: 5px;
			-webkit-borderadius: 5px;
			border-radius:5px;
			cursor:pointer;
		}

		header{
			margin:0%;
			width:100%;
			height:50px;
			background-color:#7b8d42;
			color:#7b8d42;
			text-align:center;
		}

		footer{
			margin-top:10%;
			width:100%;
			height:80px;
			background-color:#7b8d42;
			clear:both;
		}

		.formBox_login{
			width:360px;
			margin-left:auto;
			margin-right:auto;
			text-align:center;
			align:center;
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
入力に誤りがあります
<s:property value="errorMsg"/>



<div class="formBox_login">
<form action="LoginAction">
	<table>
		<tr>
			<td>ユーザーアドレス:</td><td><input type="text" name="userAddress"/></td>
		</tr>
		<tr>
			<td>パスワード:</td><td><input type="text" name="userPassword"></td>
		</tr>
		<tr>
			<td colspan="2"><button class="actbtn" style="margin-left:160px">ログイン</button></td>
		</tr>
	</table>
</form>
</div>
<footer>
</footer>
</body>
</html>