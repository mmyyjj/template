<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ご注文履歴詳細</title>
<!-- cssの設定・読み込み -->
<link rel="stylesheet" type="text/css" href="http://yui.yahooapis.com/3.18/build/cssreset/cssreset-min.css">
<link rel="stylesheet" type="text/css" href="css/user_main_design.css">
</head>
<body>
<header>
	<s:include value="header.jsp"/>
</header>

<div class="contents">

<br>
<h1>購入履歴詳細</h1>

<h3>注文番号：<s:property value="order_id"/></h3>
<table class="visible_table" style="width:580px">

<tr>
  <th style="width:180px">商品名</th><th style="width:100px">単価</th><th>購入数</th>
</tr>
<s:iterator value="u_historyDetailList">
<tr>
<td><s:property value="product_name"/></td>
<td><s:property value="unit_price"/> 円</td>
<td><s:property value="order_number"/>個 (うちラッピング包装：<s:property value="number_for_gift"/>個)</td>
</tr>
</s:iterator>
</table>

<div style="height:50px"></div>
<hr style="border:1px dashed">


<table style="margin:0 auto; height:120px;">
<tr>
<s:form action="GoUserHistoryOutlineAction" theme="simple">
  <td style="border:0px"><button class="actbtn">戻る</button></td>
</s:form>
</tr>
</table>

<div style="height:120px;"></div>
</div>
<footer style="margin-top:0px;">
</footer>
</body>
</html>