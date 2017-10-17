<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>商品情報編集-入力</title>
<link rel="stylesheet" type="text/css" href="http://yui.yahooapis.com/3.18/build/cssreset/cssreset-min.css">
<link rel="stylesheet" type="text/css" href="css/manager_main_design.css">
</head>
<body>
<header>
</header>

<div class="contents">
<h1>商品情報入力</h1>

<h3>編集中の商品ID：【商品ID】</h3>
<small>商品情報を入力してください</small>
<br>
<br>
<form>
<table style="width:480px;">
<tr>
<th>商品名</th>
<td><input type="text" size="30"required /></td>
</tr>
<tr>
<th>分類</th>
<td>
<select>
<option value="キッチン用品">キッチン用品</option>
<option value="ステーショナリー">ステーショナリー</option>
<option value="ミニインテリア">ミニインテリア</option>
</select>
</td>
</tr>
<tr>
<th>単価</th>
<td><input type="text" size="10" pattern="[0-9]{20}" required />円</td>
</tr>
<tr>
<th>初期在庫</th>
<td><input type="text" size="10" pattern="[0-9]{20}" required />個</td>
</tr>
<tr>
<th>説明<br>(300字以内)</th>
<td>
<textarea rows="10" cols="30"></textarea>
</td>
</tr>
<tr>
<th rowspan="2">選択中の画像：</th><td>【画像名】</td>
</tr>
<tr>
<td>画像更新：<input type="file"></td>
</tr>
<tr>
<th style="height:100px;">画像プレビュー</th><td></td>
</tr>
</table>
<br>
<div style="margin-top:20px; margin-bottom:60px; font-size:16px; color:red;">
<label>
<input type="checkbox">この商品を削除する
</label>
</div>


<button class="oprbtn_large">確認</button>

</form>

<div style="height:50px"></div>
<hr>
<div style="height:50px"></div>
<table style="border:0px;">
<tr style="border:0px;">
<td style="border:0px; padding-top:5px; padding-bottom:5px;"><button class="oprbtn_large">一覧に戻る</button></td>
</tr>
</table>
</div>
<footer>
</footer>
</body>