<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ご購入履歴一覧</title>
<!-- cssの設定・読み込み -->
<link rel="stylesheet" type="text/css" href="http://yui.yahooapis.com/3.18/build/cssreset/cssreset-min.css">
<link rel="stylesheet" type="text/css" href="css/user_main_design.css">
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