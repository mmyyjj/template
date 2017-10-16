<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style>

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
			font-size16px;
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

		/*ここからぺージ固有、カート画面と同一*/
		table.visible_table{
			border:2px solid #7b8d42;
			width:840px;
			height:100%;
			margin:0 auto;
			border-collapse:collapse;
			padding:0px 0px;
		}

		tr, td, th{
			border:1px solid #7b8d42;
			padding:5px 0px;
		}


		.button_table{
			border:0px;
			margin:0 auto;
			height:120px;
		}

</style>
<title>ご購入履歴</title>
</head>
<body>
<header>
</header>

<div class="contents" style="padding-top:40px;">
<h1>ご購入履歴</h1>

<table class="visible_table" style="width:480px; padding:0px 0px;">
<tr>
  <th>購入日</th><th>合計金額</th><th>操作</th><th>操作</th>
</tr>
<tr>
  <td>2017/10/16</td>
  <td>\2.980</td>
  <td style="width:100px;"><button class="actbtn" style="width:80px; margin-left:10px; margin-right:10px;">詳細</button></td>
  <td style="width:100px;"><button class="actbtn" style="width:80px; margin-left:10px; margin-right:10px;">削除</button></td>
</tr>
</table>
<br>

<table style="margin:0 auto; height:120px;">
<tr>
  <td style="border:0px"><button class="actbtn">戻る</button></td>
</tr>
</table>

</div>



<footer>
</footer>
</body>
</html>