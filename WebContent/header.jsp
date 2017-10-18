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

		/*以下、アイテムリスト画面のみで使用*/
		.side_menu{
			margin:32px;
			margin-top:20px;
			float:left;
			border:2px solid #7b8d42;
			width:180px;
			folat:left;
			height:360px;
		}

		.item_list{
			padding:20px;
			float:left;
			margin:30px;
			margin-top:20px;
			border:2px solid #7b8d42;
			width:480px;
			height:580px;
			text-align:left;
		}

		.clear{
			clear:both;
		}

		.item_table{
			width:430px;
			margin-left:5%;
			margin-right:5%;
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
<table style="margin:0 auto; width:640px; color:lightyellow; padding:40px; padding-top:5px;">
<tr>
<th style="font-size:20px">TOP</th><th style="width:50px"></th><th>ABOUT</th><th>MY PAGE</th><th>CART</th><th>LOGOUT</th>
</tr>
</table>
</header>
</body>
</html>