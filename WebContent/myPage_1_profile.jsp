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
			margin:0 auto;
			border:collapse:collapse;
			padding:0px;
		}
</style>

</head>
<body>
<header>
	<s:include value="header.jsp"/>
</header>

<div class="contents">
<br>
<h1>お客様マイページ</h1>
<br>
<h3>ご登録情報</h3>
<table style="border-collapse:collapse;">
<tr>
<th>
  お名前
</th>
<td>
  <s:property value='session.get("user_name")'/>様
</td>
</tr>
<tr>
<th>メールアドレス</th>
<td><s:property value='session.get("mail_address")'/></td>
</tr>
<tr>
<th>ご住所</th>
<td><s:property value='session.get("postal_code")'/><br>
<s:property value='session.get("street_address")'/></td>
</tr>
<tr>
<th>ご連絡先</th>
<td><s:property value='session.get("phone_number")'/></td>
</tr>
</table>

<div style="height:50px"></div>

<table>
<tr>
<td style="border:0px;">
<s:form action = "GoUserHistoryOutlineAction">
<button class="actbtn">購入履歴を見る</button>
</s:form>
</td>
</tr>
<tr>
<td style="border:0px;">
<button class="actbtn">トップに戻る</button>
</td>
</tr>
</table>
<div style="height:80px;"></div>
</div>



<footer style="padding-top:10px;">
<font color="lightyellow">All Rights Reserved</font>
</footer>
</body>
</html>