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
		<s:include value="header.jsp"/>
</header>

<div class="contents" style="padding-top:40px;">
<h1>ご購入履歴</h1>

<table class="visible_table" style="width:820px; padding:0px 0px;">
<tr style="font-size:12px;">
  <th>注文番号</th>
  <th>合計金額</th>
  <th>注文日</th>
  <th>お支払い方法</th>
  <th>代引き手数料</th>
  <th>配達希望日</th>
  <th>購入商品</th>
  <th>削除</th>
</tr>

<s:iterator value='session.get("u_historyOutlineList")' >
<tr>
  <td><s:property value="order_id"/></td>
  <td><s:property value="total_price"/> 円</td>
    <td><s:property value="order_date"/></td>
  <td><s:property value="payment_method_string"/></td>
  <td><s:property value="delivery_fee"/> 円</td>
  <td><s:property value="delivery_date"/>  <s:property value="delivery_time_string"/></td>
  <td style="width:80px"><button class="actbtn" style="width:70px; margin-left:10px; margin-right:10px;">購入商品</button></td>
  <td style="width:80px"><button class="actbtn" style="width:70px; margin-left:10px; margin-right:10px;">削除</button></td>
</tr>
</s:iterator>
</table>


<table style="margin:0 auto; height:120px;">
<tr>
<s:form action="GoMyPageAction">
  <td style="border:0px"><button class="actbtn">戻る</button></td>
</s:form>
</tr>
</table>

</div>



<footer>
</footer>
</body>
</html>