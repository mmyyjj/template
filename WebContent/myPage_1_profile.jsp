<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>お客様マイページ</title>
<!-- cssの設定・読み込み -->
<link rel="stylesheet" type="text/css" href="http://yui.yahooapis.com/3.18/build/cssreset/cssreset-min.css">
<link rel="stylesheet" type="text/css" href="css/user_main_design.css">
<style type="text/css">
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
	<s:include value="header.jsp"/>
</header>

<div class="contents" style="height:540px; padding-top:50px;">
<h1>お客様マイページ</h1>
<br>
お名前：<s:property value='session.get("user_name")'/>様<br>
メールアドレス：<s:property value='session.get("mail_address")'/>
ご住所：<s:property value='session.get("postal_code")'/><br>
<s:property value='session.get("street_address")'/>
ご連絡先：<s:property value='session.get("phone_number")'/>

<table>
<tr>
<td>
<button class="actbtn">購入履歴を見る</button>
</td>
</tr>
<tr>
<td>
<button class="actbtn">トップに戻る</button>
</td>
</tr>
</table>
</div>



<footer>
</footer>
</body>
</html>