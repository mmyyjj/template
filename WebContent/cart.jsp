<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>カート画面</title>
<!-- cssの設定・読み込み -->
<link rel="stylesheet" type="text/css" href="http://yui.yahooapis.com/3.18/build/cssreset/cssreset-min.css">
<link rel="stylesheet" type="text/css" href="css/user_main_design.css">
</head>

<body>
<header>
	<s:include value="header.jsp"/>
</header>

<div class="contents">
<div style="height:5px;"></div>
<h1>カート画面</h1>
<br>
<table class="visible_table" style="width:820px">
<tr>
  <th>商品画像</th><th style="width:180px">商品名</th><th style="width:100px">単価</th><th>購入数</th><th>プレゼント包装</th><th style="width:100px">小計</th><th>操作</th>
</tr>
<tr>
<td style="width:100px">商品画像</td>
<td>商品名</td>
<td>単価</td>
<td>
	<s:select list="{1,2,3,4,5,6,7,8,9,10}" value="3" theme="simple">
	</s:select>個
</td>
<td>
	<s:select list="{1,2,3,4,5,6,7,8,9,10}" value="3" theme="simple">
	</s:select>個
</td>
<td>小計</td>
<td style="width:80px;"><button class="actbtn" style="width:80px; margin-left:10px; margin-right:10px;">削除</button></td>
</tr>
</table>

<br>
<div style="text-align:center; font-size:18px">合計金額　1.000円</div>
<br>
<br>
<hr>


<table style="margin:0 auto; height:120px;">
<tr>
  <td style="border:0px"><button class="actbtn">お買い物を続ける</button></td>
  <td style="border:0px"><button class="actbtn">ご注文へ</button></td>
</tr>
</table>

<div style="height:200px"></div>
</div>


<footer style="margin-top:0%;">
</footer>
</body>
</html>