<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

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
			font-size:16px;
			line-height:50px;
			background-color:#7b8d42;
			color:#fff3b8;
		}

		footer{
			width:100%;
			height:80px;
			background-color:#7b8d42;
			clear:both;
		}

		.contents{
			text-align:center;
			paddng:0px;
			margin:0 auto;
			width:840px;
			height:100%;
			background-color:lightyellow;

		}

		.cart_table{
			border:1px solid #7b8d42;
			width:840px;
			height:100%;
			cellpadding:0%;
		}

		tr, td, th{
			border:1px solid #7b8d42;
			sellspacing:0px;
			cellpadding:0px;
		}


		.button_table{
			border:0px;
			margin:0 auto;
			height:120px;
		}


</style>


<title>カート画面</title>
</head>
<body>
<header>
</header>

<div class="contents">


<h1>カート画面</h1>

<table class="cart_table">
<tr>
  <th>商品画像</th><th>商品名</th><th>単価</th><th>購入数</th><th>小計</th><th>操作</th>
</tr>
<tr>
<td style="width:50px">商品画像</td><td>商品名</td><td>単価</td><td>購入数</td><td>小計</td><td style="width:80px;"><button class="actbtn">削除</button></td>
</tr>
</table>

<br>
<div style="text-align:center; font-size:18px">合計金額　1.000円</div>
<br>
<hr style="border:1px dashed">


<table style="margin:0 auto; height:120px;">
<tr>
  <td style="border:0px"><button class="actbtn">お買い物を続ける</button></td>
</tr>
<tr>
  <td style="border:0px"><button class="actbtn">お会計へ</button></td>
</tr>
</table>


</div>









<footer style="margin-top:100%;">
</footer>
</body>
</html>