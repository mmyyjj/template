<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>商品管理</title>
<link rel="stylesheet" type="text/css" href="http://yui.yahooapis.com/3.18/build/cssreset/cssreset-min.css">
<link rel="stylesheet" type="text/css" href="css/manager_main_design.css">
</head>
<body>
<header>
</header>

<div class="contents">
<h1>取扱商品一覧</h1>


商品ID、商品名、分類、単価、在庫、操作（編集）、
<table style="width:680px;">
<tr>
<th>商品ID</th>
<th>商品名</th>
<th>分類</th>
<th>単価</th>
<th>在庫</th>
<th>操作</th>
</tr>
<tr>
<td>01</td>
<td>オリジナルマグカップ</td>
<td>キッチン用品</td>
<td>1.280円</td>
<td>50</td>
<td><button class="oprbtn">編集</button></td>
</tr>
</table>
</div>

<div style="height:100px"></div>

<table style="border:0px;">
<tr style="border:0px;">
<td style="border:0px; padding-top:5px; padding-bottom:5px;"><button class="oprbtn_large">商品の追加</button></td>
</tr>
<tr style="border:0px">
<td style="border:0px; padding-top:5px; padding-bottom:5px;"><button class="oprbtn_large">トップに戻る</button></td>
</tr>
</table>
<footer>
</footer>
</body>
</html>