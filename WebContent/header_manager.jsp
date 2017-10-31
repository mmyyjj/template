<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- cssの設定・読み込み -->
<link rel="stylesheet" type="text/css" href="http://yui.yahooapis.com/3.18/build/cssreset/cssreset-min.css">
<link rel="stylesheet" type="text/css" href="css/manager_main_design.css">
<style type="text/css">
		a hover{
			color:lightyellow;
		}

		table{
			margin:0 auto;
			border:collapse:collapse;
			padding:0px;
			border:0px;
		}
</style>

</head>

<body>
<header style="padding-top:0px;">
<!-- ログイン中 -->
<table style="margin:0 auto; width:640px; height:24px; padding:40px; padding-top:5px;">
<tr>
<th style="font-size:20px; width:120px;">
<a href="GoManagerTopAction">TOP</a>
</th>
<th>
<a href="GoManagerProductListAction">■商品管理■</a>
</th>
<th>
<a href="GoManagerHistoryOutlineAction">■注文履歴確認■</a>
</th>
<th>
<a href="GoCustomerListAction">■顧客情報確認■</a>
</th>

<th>
  <a href="LogoutAction">■ログアウト■</a>
</th>
</tr>
</table>

</header>

</body>
</html>