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
<form action="CompleteProductAddAction">
<table style="width:480px;">
<tr>
<th>商品名</th>
<td><input type="text" name="new_product_name" size="30"required value="<s:property value='session.get("new_product_name")'/>"></td>
</tr>
<tr>
<th>分類</th>
<td>
<s:select name="new_category" list='{"キッチン用品","ステーショナリー","インテリア"}' theme="simple"/>
</td>
</tr>
<tr>
<th>単価</th>
<td>
<input type="text" name="new_unit_price" size="10" pattern="[0-9]{1,20}" required  value="<s:property value='session.get("new_unit_price")'/>"/>
円</td>
</tr>
<tr>
<th>在庫</th>
<td><input type="text" name="new_current_stock" size="10" pattern="[0-9]{1,20}" required value="<s:property value='session.get("new_current_stock")'/>"/>個</td>
</tr>
<tr>
<th>説明<br>(300字以内)</th>
<td>
<textarea rows="10" cols="30" maxlength="300" name="new_comment" required><s:property value='session.get("new_comment")'/></textarea>
</td>
</tr>
<tr>
<th rowspan="2">選択中の画像：</th><td><s:select name="new_img_path" list="imagePathList" value="img/sample_1.png" theme="simple"/></td>

</tr>
</table>
<br>
<button class="oprbtn_large">追加</button>

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