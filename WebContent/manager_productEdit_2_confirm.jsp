<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>商品情報編集-確認</title>
<link rel="stylesheet" type="text/css" href="http://yui.yahooapis.com/3.18/build/cssreset/cssreset-min.css">
<link rel="stylesheet" type="text/css" href="css/manager_main_design.css">
</head>
<body>
<header>
</header>

<div class="contents">
<h1>編集内容確認</h1>
※この後if分岐で編集/削除によって表示を分ける。

<small>以下の内容で商品を編集します。よろしければ「完了」ボタンをクリックしてください。</small>
<form>
<table style="width:480px;">
<tr>
<th>商品名</th>
<td>【商品名】</td>
</tr>
<tr>
<th>分類</th>
<td>
【分類】
</td>
</tr>
<tr>
<th>単価</th>
<td>【単価】円</td>
</tr>
<tr>
<th>初期在庫</th>
<td>【在庫】個</td>
</tr>
<tr>
<th>説明<br>(300字以内)</th>
<td>
【説明】
</td>
</tr>
<tr>
<th>画像</th><td>【画像名】</td>
</tr>
<tr>
<th style="height:100px;">画像プレビュー</th><td></td>
</tr>
</table>
<br>
<button class="oprbtn_large">完了</button>

</form>

<div style="height:50px"></div>
<hr>
<div style="height:50px"></div>
<table style="border:0px;">
<tr style="border:0px;">
<td style="border:0px; padding-top:5px; padding-bottom:5px;"><button class="oprbtn_large">入力に戻る</button></td>
</tr>
</table>
</div>
<footer>
</footer>
</body>