<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ご注文内容確認画面</title>
<!-- cssの設定・読み込み -->
<link rel="stylesheet" type="text/css" href="http://yui.yahooapis.com/3.18/build/cssreset/cssreset-min.css">
<link rel="stylesheet" type="text/css" href="css/user_main_design.css">
</head>
<body>
<script type="text/javascript">
  history.pushState(null,null,null);
  window.addEventListener("popstate", function(){
	  history.pushState(null, null, null);
  });
</script>
<header>
	<s:include value="header.jsp"/>
</header>

<div class="contents" style="height:100％; padding-top:5px;">
<div style="text-align:right; margin-right:20px;">ご注文情報入力_<b>ご注文内容確認</b>_お手続き完了</div>
<h1>ご注文内容の確認</h1>
以下の内容でご注文を確定いたします。<br>
よろしければページ下の「確定」ボタンをクリックしてください
<h3>--------【1/3】ご注文商品---------</h3>
<table class="visible_table" style="width:360px">
<tr>
  <th>商品小計</th><td><s:property value='session.get("product_subtotal")' /> 円</td>
</tr>
<tr>
  <th>プレゼント包装料</th><td><s:property value='session.get("gift_wrapping_fee")'/> 円</td>
</tr>
<tr>
  <th>代引き手数料</th><td><s:property value='session.get("delivery_fee")' /> 円</td>
</tr>
<tr>
<th style="font-size:18px;">合計金額</th>
<th style="font-size:18px;"><s:property value='session.get("total_price")'/> 円</th>
</tr>
</table>
<br>
<br>


<h3>--------【2/3】お届け日---------</h3>
<br>
<table class="visible_table" style="width:360px">
<tr>
<th style="width:80px">お日にち</th>
<td>
<s:property value='session.get("delivery_date")'/>
</td>
<th style="width:80px">時間帯</th>
<td>
<s:if test="delivery_time_id==1">朝～昼</s:if>
<s:if test="delivery_time_id==2">昼～夕方</s:if>
<s:if test="delivery_time_id==3">夕方～夜</s:if>
</td>
</tr>
</table>

<br>

<h3>---------【3/3】お支払い情報----------</h3>

<table style="margin:0 auto;">
<tr>
<th style="border:0px">お支払い方法</th>
<td style="border:0px">
  <s:if test="payment_method_id == 1">代金引換
  </s:if>
  <s:if test="payment_method_id == 2">クレジットカード
  </s:if>
</td>
</tr>
</table>
<s:if test="payment_method_id == 2">
クレジットカード情報
<table class="visible_table" style="width:540px">
<tr>
 <th>クレジットカード種類</th>
 <td colspan="2"><s:property value="card_type"/></td>
</tr>
<tr>
 <th>カード番号</th>
 <td colspan="2">
   <s:property value="card_number_1"/>-
   <s:property value="card_number_2"/>-
   <s:property value="card_number_3"/>-
   <s:property value="card_number_4"/></td>
</tr>
<tr>
 <th>カード名義</th>
  <td colspan="2"><s:property value="holder_name"/></td>
</tr>
<tr>
 <th>有効期限</th>
  <td>
   <s:property value="expiration_month"/> 月
 </td>
 <td>
   <s:property value="expiration_year"/> 年
 </td>
</tr>
<tr>
 <th>セキュリティコード</th>
 <td colspan="2"><s:property value="security_code"/></td>
</tr>
</table>
<br>
<br>
<hr style="border:1px dashed">
</s:if>

<br>
<!-- 操作ボタンの部分 -->
<table style="margin:0 auto; height:120px;">
<tr>
  <td style="border:0px">
  <s:form action="CompleteOrderAction">
    <button class="actbtn" >確定</button>
  </s:form>
  </td>

</tr>
<tr>
  <td style="border:0px"><button class="actbtn">入力画面に戻る</button></td>
</tr>
</table>
<br>
<div style="height:80px">
</div>
</div>


<footer style="padding-top:10px;">
<font color="lightyellow">All Rights Reserved</font>
</footer>
</body>
</html>