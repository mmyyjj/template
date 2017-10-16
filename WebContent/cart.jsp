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


<title>カート画面</title>
</head>
<body>
<header>
</header>

<div class="contents">

<br>
<h1>カート画面</h1>

<table class="visible_table" style="width:820px">
<tr>
  <th>商品画像</th><th style="width:180px">商品名</th><th style="width:100px">単価</th><th>購入数</th><th>プレゼント包装</th><th style="width:100px">小計</th><th>操作</th>
</tr>
<tr>
<td style="width:100px">商品画像</td>
<td>商品名</td>
<td>単価</td>
<td>
	<select>
		<option value="1">1</option>
		<option value="2">2</option>
		<option value="3">3</option>
		<option value="4">4</option>
		<option value="5">5</option>
		<option value="6">6</option>
		<option value="7">7</option>
		<option value="8">8</option>
		<option value="9">9</option>
		<option value="10">10</option>
	</select>個
</td>
<td>
	<select>
		<option value="">-</option>
		<option value="1">1</option>
		<option value="2">2</option>
		<option value="3">3</option>
		<option value="4">4</option>
		<option value="5">5</option>
		<option value="6">6</option>
		<option value="7">7</option>
		<option value="8">8</option>
		<option value="9">9</option>
		<option value="10">10</option>
	</select>個
</td>
<td>小計</td>
<td style="width:80px;"><button class="actbtn" style="width:80px; margin-left:10px; margin-right:10px;">削除</button></td>
</tr>
</table>

<br>
<div style="text-align:center; font-size:18px">合計金額　1.000円</div>
<br>
<br>
<hr style="border:1px dashed">


<table style="margin:0 auto; height:120px;">
<tr>
  <td style="border:0px"><button class="actbtn">お買い物を続ける</button></td>
  <td style="border:0px"><button class="actbtn">お会計へ</button></td>
</tr>
</table>


</div>


<footer style="margin-top:100%;">
</footer>
</body>
</html>