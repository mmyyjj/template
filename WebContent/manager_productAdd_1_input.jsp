<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>新規商品登録-入力</title>
<link rel="stylesheet" type="text/css" href="http://yui.yahooapis.com/3.18/build/cssreset/cssreset-min.css">
<link rel="stylesheet" type="text/css" href="css/manager_main_design.css">
</head>
<body>
<header>
</header>

<div class="contents">
<h1>新規商品情報入力</h1>


<small>商品情報を入力してください(商品IDは自動で入ります)</small>
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
<td><input type="text" size="10" pattern="[0-9]{1,20}" required />円</td>
</tr>
<tr>
<th>初期在庫</th>
<td><input type="text" size="10" pattern="[0-9]{1,20}" required />個</td>
</tr>
<tr>
<th>説明<br>(300字以内)</th>
<td>
<textarea rows="10" cols="30" maxlength="300" required></textarea>
</td>
</tr>
<tr>
<th rowspan="2">選択中の画像：</th><td><s:select name="image_path" list="imagePathList" theme="simple"/></td>
</tr>
<tr>
<th style="height:100px;">画像プレビュー</th><td></td>
</tr>
</table>
<br>
<button class="oprbtn_large">確認</button>

</form>

<div style="height:50px"></div>
<hr>
<div style="height:50px"></div>
<table style="border:0px;">
<tr style="border:0px">
<td style="border:0px; padding-top:5px; padding-bottom:5px;"><button class="oprbtn_large">一覧に戻る</button></td>
</tr>
</table>
</div>
<footer>
</footer>
</body>