<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>セッションタイムアウト</title>
<!-- cssの設定・読み込み -->
<link rel="stylesheet" type="text/css" href="http://yui.yahooapis.com/3.18/build/cssreset/cssreset-min.css">
<link rel="stylesheet" type="text/css" href="css/user_main_design.css">
<style type="text/css">
		table{
			margin:0 auto;
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


<div class="contents" style="padding-top:10px;">
<br>
<br>
<br>
セッションがタイムアウトになりました。
<br><br>
大変お手数ですが、今一度ログインをお願いいたします。
<br><br>
<div style="height:50px;"></div>
<table>
<tr>
<td>
<button class="actbtn">ログイン</button>
<td>
</tr>
</table>
<div style="height:290px;"></div>
</div>

<footer style="padding-top:10px;">
<font color="lightyellow">All Rights Reserved</font>
</footer>
</body>
</html>