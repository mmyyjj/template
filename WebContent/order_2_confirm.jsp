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
			font-size:14px;
			text-align:center;
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

		h1 {
			text-align:center;
			margin-top:0px;
			margin-right:0 auto;
			margin-left:0 auto;
		}

		.contents{
			text-align:center;
			margin:0 auto;
			width:840px;
			height:100%;
			background-color:lightyellow;
		}

		/*ここからぺージ固有*/
		.visible_table{
			border:2px solid #7b8d42;
			height:100%;
			margin:0 auto;
			border-collapse:collapse;
			padding:0px 0px;
		}

		tr, td, th{
			border:1px solid #7b8d42;
			padding:5px 0px;
		}



</style>


<title>ご注文内容確認画面</title>
</head>
<body>
<header>
</header>

<div class="contents" style="height:100％; padding-top:5px;">
<div style="text-align:right; margin-right:20px;">ご注文情報入力_<b>ご注文内容確認</b>_お手続き完了</div>

<br>
<h1>ご注文内容の確認</h1>
以下の内容でご注文を確定いたします。<br>
よろしければページ下の「確定」ボタンをクリックしてください
<h3>--------【1/3】ご注文商品---------</h3>
<table class="visible_table" style="width:540px">
<tr>
  <th style="width:180px">商品名</th><th style="width:100px">単価</th><th>購入数</th><th>プレゼント<br>包装</th><th style="width:100px">小計</th>
</tr>
<tr>
<td>商品名</td>
<td>単価</td>
<td>
</td>
<td>
</td>
<td>小計</td>
</tr>
</table>
<br>
合計金額：【合計】円
<br>


<h3>--------【2/3】お届け日---------</h3>
<br>
<table class="visible_table" style="width:540px">
<tr>
<th style="width:80px">お日にち</th>
<td>
【○月×日】
</td>
<th style="width:80px">時間帯</th>
<td>
【AA～BB】
</td>
</tr>
</table>

<br>

<h3>---------【3/3】お支払い情報----------</h3>

<table style="margin:0 auto;:">
<tr>
<th style="border:0px">お支払い方法</th>
<td style="border:0px">
【代金引換】/【クレジットカード】
</td>
</tr>
</table>

クレジットカード情報
<table class="visible_table" style="width:540px">
<tr>
 <th>クレジットカード種類</th>
 <td colspan="2">【種類】</td>
</tr>
<tr>
 <th>カード番号</th>
 <td colspan="2">【1111 1111 1111】</td>
</tr>
<tr>
 <th>カード名義</th>
  <td colspan="2"></td>
</tr>
<tr>
 <th>有効期限</th>
  <td>
   【○】年
 </td>
 <td>
   【○】月
 </td>
</tr>
<tr>
 <th>セキュリティコード</th>
 <td colspan="2">AAA</td>
</tr>
</table>
<br>
<br>
<hr style="border:1px dashed">

<br>
<!-- 操作ボタンの部分 -->
<table style="margin:0 auto; height:120px;">
<tr>
  <td style="border:0px"><button class="actbtn">確定</button></td>
</tr>
<tr>
  <td style="border:0px"><button class="actbtn">入力画面に戻る</button></td>
</tr>
</table>
<br>
<div style="height:80px">
</div>
</div>


<footer style="margin-bottom:0%;">
</footer>
</body>
</html>