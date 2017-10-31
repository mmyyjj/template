<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>商品情報編集画面</title>
<link rel="stylesheet" type="text/css" href="http://yui.yahooapis.com/3.18/build/cssreset/cssreset-min.css">
<link rel="stylesheet" type="text/css" href="css/manager_main_design.css">
</head>
<body>
<header>
</header>

<div class="contents">
<h1>新規商品情報入力</h1>


<small>商品情報を入力してください(商品IDは変更されません)</small>
<br>
<br>
<form action="ComlpeteProductEditAction">
<table style="width:480px;">
<tr>
<th>商品名</th>
<td><input type="text" name="edit_product_name" size="30"required value="<s:property value='session.get("edit_product_name")'/>"></td>
</tr>
<tr>
<th>分類</th>
<td>
<s:select name="edit_category" list='{"キッチン用品","ステーショナリー","インテリア"}' theme="simple"/>
</td>
</tr>
<tr>
<th>単価</th>
<td>
<input type="number" name="edit_unit_price" size="10" pattern="[0-9]{1,20}"min="1" required  value="<s:property value='session.get("edit_unit_price")'/>"/>
円</td>
</tr>
<tr>
<th>在庫</th>
<td>
  現在の在庫に加算、減算されます(在庫：<s:property value='session.get("edit_current_stock")'/>)
  <input type="number" name="edit_current_stock" size="10" pattern="[0-9]{1,20}" required value="<s:property value='session.get("edit_current_stock")'/>"/>個</td>
</tr>
<tr>
<th>説明<br>(300字以内)</th>
<td>
<textarea rows="10" cols="30" maxlength="300" name="edit_comment" required><s:property value='session.get("edit_comment")'/></textarea>
</td>
</tr>
<tr>
<th rowspan="2">選択中の画像：</th><td><s:select name="edit_img_path" list="imagePathList" value="%{session.get('edit_img_path')}" theme="simple"/></td>
</tr>
</table>

<br>
<br>
<label><input type="checkBox"required>確認</label>
<br>
<br>
<br>
<button class="oprbtn_large">完了</button>

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